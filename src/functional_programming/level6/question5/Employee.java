package functional_programming.level6.question5;

public class Employee {
    private String empName;
    private  String department;
    private Double salary;

    public Employee(String empName, String department, Double salary) {
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }
}
