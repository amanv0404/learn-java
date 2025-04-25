//6. Student Registry (Static vs Instance)
//Create a `Student` class with a static counter to track total students. Each student has a unique ID
//and name. Display the total number of students after creating multiple objects.

package javaOopsConcept;

class Student{

    private int stuId;
    private String name;
    private static int totalStudent = 0;

    Student(int stuId,String name){
        this.stuId = stuId;
        this.name = name;
        totalStudent++;
    }


    void getStudentDetail(){
        System.out.println("Student ID: "+stuId);
        System.out.println("Student Name: "+name);
    }

    int getTotalStudent(){
        return totalStudent;
    }

}
public class Question6 {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman Verma");
        Student s2 = new Student(2, "Ironman");
        Student s3 = new Student(3, "Spiderman");

        s1.getStudentDetail();
        System.out.println("Total Student: "+s1.getTotalStudent());
    }
}
