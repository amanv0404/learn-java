package functional_programming.level9.question2;

import java.time.LocalDate;
import java.time.Year;

public class Employee {
    private String name;
    private double salary;
    private int joiningYear;

    public Employee(String name, double salary, int joiningYear) {
        this.name = name;
        this.salary = salary;
        this.joiningYear = joiningYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}
