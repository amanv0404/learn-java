package university_registration.model;

import java.util.Objects;

public class Student {
    private String id;
    private  String name;
    private  String email;
    private  String year;
    private  String branch;

    public Student(String id, String name, String email, String year, String branch) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.year = year;
        this.branch = branch;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getBranch() {
        return branch;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(year, student.year) && Objects.equals(branch, student.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, year, branch);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", year='" + year + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }

}
