
//From a list of students with names and grades, return a list of names of students who scored above 80, sorted alphabetically.

package functional_programming.level6.question2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Aman","A",90),
                        new Student("Yash","A",93),
                        new Student("Ironman","B",80),
                        new Student("Spiderman","C",65),
                        new Student("Captain","B",84),
                        new Student("Loki","F",45),
                        new Student("Rocket","D",60)
                )
        );


        List<String> names = students.stream().
                filter(stu->stu.score > 80).
                map(stu->stu.name).toList();


        System.out.println("Students who score more then 80: "+names);



    }


}
