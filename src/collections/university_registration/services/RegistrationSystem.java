package university_registration.services;

import university_registration.model.Course;
import university_registration.model.Student;

import java.util.*;

public class RegistrationSystem {
    private Map<String, Course> courseMap = new HashMap<>();
    private Map<String, Student> studentMap = new HashMap<>();


    // display students
    public void displayStudents(){
        List<Student> students = new ArrayList<>(studentMap.values());
        students.sort(Comparator
                .comparing(Student::getYear)
                .thenComparing(Student::getBranch)
                .thenComparing(Student::getName));

        for (Student student : students) {
            System.out.println(student.getName() + " | " + student.getYear() + " | " + student.getBranch());
        }
    }

    
    // add students
    public void addStudent(Student student){
        if(studentMap.containsKey(student.getId())){
            System.out.println("Student "+student.getName()+" with ID "+ student.getId()+ "already exist");
        }else{
            studentMap.put(student.getId(),student);
        }
    }
    // add course to course map
    public void addCourse(Course course){
        if(courseMap.containsKey(course.getCourseId())){
            System.out.println("Course "+course.getCourseName()+" with ID "+ course.getCourseId()+ "already exist");
        }else{
            courseMap.put(course.getCourseId(),course);
        }
    }

    // register student to a course
    public void registerStudent(Student student, Course course) {

        if (!studentMap.containsKey(student.getId())) {
            System.out.println("Student with this ID: " + student.getId() + " does not exist in our record, please register student first");
            return;
        }
        if (!courseMap.containsKey(course.getCourseId())) {
            System.out.println("Course does not exist with this ID: " + course.getCourseId());
            return;
        }

        // both student and course exist, register student to course
        Set<Student> enrolledStudents = course.getEnrolledStudents();
        Queue<Student> waitlist = course.getWaitlist();

        // check student already register course or not
        if(enrolledStudents.contains(student)) {
            System.out.println("Student is already enrolled in the course");
            System.out.println("Student: "+student.getName() + "("+student.getId()+")");
            return;
        }

        // check student in waitlist
        if(waitlist.contains(student)){
            System.out.println("Student is already in the waitlist for this course.");
            System.out.println("Student: "+student.getName() + "("+student.getId()+")");
            return;
        }
        // check capacity
        if(course.isFull()){
            waitlist.add(student);
            System.out.println("Course is full. Student added to the waitlist. Course "+course.getCourseName()+ "("+course.getCourseId()+")" );
            System.out.println("Student: "+student.getName() + "("+student.getId()+")");
        }else{
            // enroll student to course
            enrolledStudents.add(student);
            System.out.println("Student "+student.getName()+" ID: "+student.getId()+" enrolled to course "+course.getCourseName()+" ID: "+course.getCourseId()+" successfully!");
            return;
        }

    }


    // delete/drop student from course
    public  void dropStudent(Student student, Course course){
        if (!studentMap.containsKey(student.getId())) {
            System.out.println("Student with this ID: " + student.getId() + " does not exist in our record, please register student first");
            return;
        }
        if (!courseMap.containsKey(course.getCourseId())) {
            System.out.println("Course does not exist with this ID: " + course.getCourseId());
            return;
        }

        Set<Student> enrolledStudents = course.getEnrolledStudents();
        Queue<Student> waitlist = course.getWaitlist();

        enrolledStudents.remove(student);
        System.out.println("Student "+student.getName()+","+ "Successfully removed from course "+"Course "+course.getCourseName()+"("+course.getCourseId()+")");

        // promote from waitlist if available

        if(!waitlist.isEmpty()){
            Student promotedStudent = waitlist.poll();
            if(!course.isFull()){
                enrolledStudents.add(promotedStudent);
                System.out.println("Student " + promotedStudent.getName() + " has been enrolled from the waitlist.");
            }
        }
    }



    // list student by course
    public void listStudentsInCourse(String courseId) {
        Course course = courseMap.get(courseId);

        if (course == null) {
            System.out.println("Course with ID " + courseId + " does not exist.");
            return;
        }

        Set<Student> enrolledStudents = course.getEnrolledStudents();

        if (enrolledStudents.isEmpty()) {
            System.out.println("No students are enrolled in this course.");
            return;
        }

        System.out.println("Students enrolled in course: " + course.getCourseName());

        for(Student student : enrolledStudents){
            System.out.println(student.getName()+" "+student.getId());
        }
        System.out.println("----------------");

    }

    // list student by branch name
    public void listStudentsByBranch(String branch) {

        List<Student> studentsOfBranch = new ArrayList<>();

        for(Course course : courseMap.values()){
            for(Student student : course.getEnrolledStudents()){

                if(student.getBranch().equalsIgnoreCase(branch)){
                    studentsOfBranch.add(student);
                }

            }
        }

        if (studentsOfBranch.isEmpty()) {
            System.out.println("No students found from branch: " + branch);
            return;
        }

        // sort by name
        studentsOfBranch.sort(Comparator.comparing(Student::getName));

        System.out.println("Student from branch: "+branch);
        for(Student student : studentsOfBranch){
            System.out.println(student.getName() +" "+ "("+student.getId()+")");
        }
        System.out.println("----------------");

    }

    // list course by enrollments
    public void listCoursesByEnrollment() {
        List<Course> courses = new ArrayList<>(courseMap.values());

        // sort by number of enrolled students, descending
        courses.sort((c1, c2) -> Integer.compare(
                c2.getEnrolledStudents().size(),
                c1.getEnrolledStudents().size()
        ));

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("Courses sorted by number of enrolled students: ");
        for(Course course : courses){
            System.out.printf(" %s (%s): %d students enrolled%n",
                    course.getCourseName(), course.getCourseId(), course.getEnrolledStudents().size());
        }
        System.out.println("----------------");

    }

    // filter course by credits
    public void filterCoursesByCredits(int creditValue) {
        List<Course> filtered = courseMap.values().stream()
                .filter(course -> course.getCredits() == creditValue)
                .toList();

        if (filtered.isEmpty()) {
            System.out.println("No courses found with " + creditValue + " credits.");
            return;
        }

        System.out.println("Courses with " + creditValue + " credits:");
        for (Course course : filtered) {
            System.out.println( course.getCourseName() + " (" + course.getCourseId() + ")");
        }
        System.out.println("----------------");
    }

    // filter course by instructor
    public void filterCoursesByInstructor(String instructorName) {
        List<Course> filtered = courseMap.values().stream()
                .filter(course -> course.getInstructorName().equalsIgnoreCase(instructorName))
                .toList();

        if (filtered.isEmpty()) {
            System.out.println("No courses found taught by " + instructorName + ".");
            return;
        }

        System.out.println("Courses taught by " + instructorName + ":");
        for (Course course : filtered) {
            System.out.println("- " + course.getCourseName() + " (" + course.getCourseId() + ")");
        }
        System.out.println("----------------");
    }


}
