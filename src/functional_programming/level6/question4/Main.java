

// Given a list of Employee objects, group them by department and count how many employees are in each department.

package functional_programming.level6.question4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> listOfEmp = new ArrayList<>(Arrays.asList(
           new Employee("Aman","IT"),
           new Employee("Iromman","IT"),
           new Employee("Spiderman","Sale"),
           new Employee("Captain","Marketing"),
           new Employee("Loki","Sale"),
           new Employee("Rocket","HR")
        ));


        Map<String, Long> countByDept = listOfEmp.stream().
                collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        countByDept.forEach((dept, count) ->
                System.out.println(dept + " -> " + count)
        );
    }
}
