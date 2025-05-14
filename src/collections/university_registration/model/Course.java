package university_registration.model;

import java.util.*;

public class Course {

    private String courseId;
    private String courseName;
    private String instructorName;
    private int capacity;
    private int credits;

    private Set<Student> enrolledStudents;
    private Queue<Student> waitlist;

    public Course(String courseId, String courseName, int capacity, String instructorName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.instructorName = instructorName;
        this.credits = credits;
        enrolledStudents = new TreeSet<>(Comparator.comparing(Student::getName));
        waitlist = new LinkedList<>();
    }




    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return capacity == course.capacity && credits == course.credits && Objects.equals(courseId, course.courseId) && Objects.equals(courseName, course.courseName) && Objects.equals(instructorName, course.instructorName) && Objects.equals(enrolledStudents, course.enrolledStudents) && Objects.equals(waitlist, course.waitlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName, instructorName, capacity, credits, enrolledStudents, waitlist);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getCourseId() {
        return courseId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCredits() {
        return credits;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Queue<Student> getWaitlist() {
        return waitlist;
    }

    public boolean isFull() {
        return enrolledStudents.size() >= capacity;
    }





}
