
// Write a program that groups a list of employees by joining year, and then finds the max salary in each year.

package functional_programming.level9.question2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee("Aman", 2020, 50000),
                new Employee("Yash", 2020, 55000),
                new Employee("Ben", 2021, 48000),
                new Employee("Spiderman", 2021, 60000),
                new Employee("Ironman", 2022, 65000)
        ));

        Map<Integer, Optional<Employee>> maxSalaryByYear = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getJoiningYear,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        maxSalaryByYear.forEach((year, employeeOpt) ->
                System.out.println(year + " → " + employeeOpt.orElse(null))
        );


    }
}
