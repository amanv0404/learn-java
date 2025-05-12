package university_registration.main;

import university_registration.model.Course;
import university_registration.model.Student;
import university_registration.services.RegistrationSystem;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[] {
                new Student("S001", "Aarav Sharma", "aarav.sharma@example.com", "1st", "CSE"),
                new Student("S002", "Isha Verma", "isha.verma@example.com", "2nd", "ECE"),
                new Student("S003", "Raj Patel", "raj.patel@example.com", "3rd", "MECH"),
                new Student("S004", "Sneha Reddy", "sneha.reddy@example.com", "4th", "CSE"),
                new Student("S005", "Vikram Singh", "vikram.singh@example.com", "1st", "EEE"),
                new Student("S006", "Priya Das", "priya.das@example.com", "2nd", "CIVIL"),
                new Student("S007", "Yash Mehta", "yash.mehta@example.com", "3rd", "CSE"),
                new Student("S008", "Kavya Nair", "kavya.nair@example.com", "2nd", "ECE"),
                new Student("S009", "Ankit Joshi", "ankit.joshi@example.com", "4th", "MECH"),
                new Student("S010", "Riya Banerjee", "riya.banerjee@example.com", "1st", "CSE")
        };


        Course[] courses = new Course[] {
                new Course("CSE101", "Data Structures", 3, "Dr. Anil Kumar", 4),
                new Course("CSE301", "Digital Electronics", 2, "Prof. Meera Rani", 3),
                new Course("CSE201", "DBMS", 4, "Dr. Raghav Rao", 4),
                new Course("CSE401", "Computer Networks", 2, "Prof. Nisha Iyer", 3),
                new Course("CSE501", "Operating Systems", 3, "Dr. Sandeep Mishra", 4)
        };


        RegistrationSystem register = new RegistrationSystem();

        // add students
        for(int i = 0; i < 10; i++){
            register.addStudent(students[i]);
        }

        // add courses
        register.addCourse(courses[0]);
        register.addCourse(courses[1]);
        register.addCourse(courses[2]);
        register.addCourse(courses[3]);
        register.addCourse(courses[4]);

        // register course
        register.registerStudent(students[0],courses[0]);
        register.registerStudent(students[1],courses[2]);
        register.registerStudent(students[2],courses[0]);
        register.registerStudent(students[3],courses[3]);
        register.registerStudent(students[4],courses[4]);
        register.registerStudent(students[5],courses[3]);
        register.registerStudent(students[6],courses[3]);
        register.registerStudent(students[7],courses[2]);
        register.registerStudent(students[8],courses[3]);
        register.registerStudent(students[9],courses[3]);


        System.out.println(" ");

        register.listStudentsInCourse("CSE101");
        register.listStudentsByBranch("CSE");
        register.listCoursesByEnrollment();
        register.filterCoursesByInstructor("Dr. Anil Kumar");
        register.filterCoursesByCredits(3);


        // Use Comparator for custom sorting (e.g., by year,
        //branch, name)
        register.displayStudents();


        // drop student from course
        register.dropStudent(students[3],courses[3]);


    }
}
