
//Problem 3: Department Directory with Sorted Employees (Map, List)
//Maintain a Map<String, List<Employee>> where the key is department name.
//• Sort each department’s employees by salary descending.
//• Provide a method to return top N paid employees across all departments.
//

package collections;

import java.util.*;

class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;


    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    public void printInfo() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
        System.out.println("----------------");
    }
}
public class Problem3 {

    public static void main(String[] args) {

        List<Employee> allEmployees = Arrays.asList(
                new Employee(1, "Aarav Sharma", "IT", 85000),
                new Employee(2, "Priya Verma", "HR", 72000),
                new Employee(3, "Rohan Mehta", "IT", 90000),
                new Employee(4, "Sneha Iyer", "Sales", 67000),
                new Employee(5, "Vikram Patel", "HR", 76000),
                new Employee(6, "Tanvi Rao", "Sales", 82000),
                new Employee(7, "Karan Joshi", "IT", 78000),
                new Employee(8, "Neha Kapoor", "Marketing", 95000),
                new Employee(9, "Divya Nair", "Marketing", 88000),
                new Employee(10, "Manav Singh", "HR", 81000)
        );


        // map employees by department
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee emp : allEmployees) {
            departmentMap
                    .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                    .add(emp);
        }



        // sort each department's employees by salary descending
        for (List<Employee> list : departmentMap.values()) {
            list.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        }

        // print top N paid employees overall
        System.out.println("Top 5 Paid Employees Across All Departments \n");
        List<Employee> topN = getTopPaidEmployees(allEmployees, 5);
        for (Employee emp : topN) {
            emp.printInfo();
        }

    }

    public static List<Employee> getTopPaidEmployees(List<Employee> employees, int n) {
        return employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .limit(n)
                .toList();
    }
}
