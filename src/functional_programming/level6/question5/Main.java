
//Calculate the average salary of employees in each department using Collectors.groupingBy() and averagingDouble().

package functional_programming.level6.question5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Aman", "IT", 50000.0),
                new Employee("Yash", "IT", 70000.0),
                new Employee("Spiderman", "IT", 80000.0),
                new Employee("Captain", "Finance", 60000.0),
                new Employee("Loki", "HR", 55000.0)
        );

        Map<String,Double> averageSalaries = employees.stream().
                collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));


        averageSalaries.forEach((dept, avg) ->
                System.out.println(dept + " -> " + avg)
        );
    }
}
