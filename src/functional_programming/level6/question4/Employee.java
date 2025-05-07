package functional_programming.level6.question4;

public class Employee {
    private String empName;
    private  String department;

    public Employee(String empName, String department) {
        this.empName = empName;
        this.department = department;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }
}
