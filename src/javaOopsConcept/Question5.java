//5. Employee Payroll System (Abstraction)
//Create an abstract class `Employee` with abstract methods `calculateSalary()` and `getDetails()`.
//Extend it with `FullTimeEmployee` and `Freelancer` classes, each with their own salary calculation
//logic.

package javaOopsConcept;

abstract class Employee {
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }


    public abstract double calculateSalary();


    public abstract String getDetails();

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getDetails() {

        return "Full-Time Employee ID: " + getEmployeeId() +
                ", Name: " + getName() +
                ", Monthly Salary: " + monthlySalary;
    }
}


class Freelancer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Freelancer(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getDetails() {

        return "Freelancer ID: " + getEmployeeId() +
                ", Name: " + getName() +
                ", Hourly Rate: " + hourlyRate +
                ", Hours Worked: " + hoursWorked +
                ", Total Salary: " + calculateSalary();
    }
}

public class Question5 {

    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(101, "Aman Verma", 5000.00);
        Freelancer freelancerEmp = new Freelancer(201, "Spiderman", 30.00, 160);

        System.out.println(fullTimeEmp.getDetails());
        System.out.println("Salary: " + fullTimeEmp.calculateSalary());

        System.out.println(freelancerEmp.getDetails());
        System.out.println("Salary: " + freelancerEmp.calculateSalary());
    }
}
