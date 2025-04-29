//Problem 1: Advanced Student Management (List, Comparator, Map)
//
//Create a Student class with id, name, age, grade, and branch.
//        • Store at least 15 students in an ArrayList.
//        • Sort students by branch, then by descending grade.
//• Group students by branch using a Map<String, List<Student>>.

package collections;
import java.util.*;


class Student{

    private int id;
    private String name;
    private  int age;
    private Grade grade;
    private String branch;


    public Student(int id, String name, int age, Grade grade,String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }

    public String getBranch() {
        return branch;
    }



     void studentDetail(){
           System.out.println("Id: "+getId());
           System.out.println("Name: "+getName());
           System.out.println("Age: "+getAge());
           System.out.println("Branch: "+getBranch());
           System.out.println("Grade: "+getGrade());
           System.out.println("---------------------");
    }


}
public class Problem1 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Map<String, List<Student>> groupedByBranch = new HashMap<>();


        students.add(new Student(1, "Aarav Sharma", 19, Grade.A, "Computer Science"));
        students.add(new Student(2, "Priya Verma", 20, Grade.B, "Electronics"));
        students.add(new Student(3, "Rohan Mehta", 21, Grade.C, "Mechanical"));
        students.add(new Student(4, "Sneha Iyer", 19, Grade.A, "Computer Science"));
        students.add(new Student(5, "Vikram Patel", 22, Grade.D, "Civil"));
        students.add(new Student(6, "Tanvi Rao", 20, Grade.B, "Electrical"));
        students.add(new Student(7, "Karan Joshi", 21, Grade.C, "Computer Science"));
        students.add(new Student(8, "Neha Kapoor", 18, Grade.B, "Information Technology"));
        students.add(new Student(9, "Arjun Desai", 20, Grade.E, "Mechanical"));
        students.add(new Student(10, "Divya Nair", 21, Grade.A, "Computer Science"));
        students.add(new Student(11, "Manav Singh", 20, Grade.F, "Civil"));
        students.add(new Student(12, "Pooja Yadav", 18, Grade.D, "Electronics"));
        students.add(new Student(13, "Rahul Khanna", 22, Grade.B, "Computer Science"));
        students.add(new Student(14, "Aditi Mishra", 21, Grade.A, "Information Technology"));
        students.add(new Student(15, "Yash Thakur", 20, Grade.C, "Electrical"));


        // Sort students by branch, then by descending grade
        students.sort(
                Comparator.comparing(Student::getBranch)
                        .thenComparing(Comparator.comparing(Student::getGrade).reversed())
        );


        for(Student stu: students){
            stu.studentDetail();
        }

        // Group students by branch using a Map<String, List<Student>>.
        for (Student s : students) {
               groupedByBranch
                      .computeIfAbsent(s.getBranch(), k -> new ArrayList<>())
                      .add(s);
        }

        System.out.println("=== Students Grouped by Branch ===");
        for (String branch : groupedByBranch.keySet()) {
            System.out.println("Branch: " + branch);
            for (Student s : groupedByBranch.get(branch)) {
                System.out.println("  " + s.getName() + " (" + s.getGrade() + ")");
            }
        }










    }
}
