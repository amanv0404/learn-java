

//Problem 8: Employee Hierarchy System (Map, TreeMap)
//Maintain a hierarchy with Map<Manager, TreeMap<Level, List<Employee>>>.
//• Print employees reporting to a manager at each level.



package collections;

import java.util.*;

enum Level {
    INTERN, JUNIOR, MID, SENIOR, LEAD
}


class Employees {
    private String name;
    private int id;

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[" + id + " - " + name + "]";
    }
}

class Manager {
    private String name;
    private int id;

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager m = (Manager) o;
        return id == m.id && Objects.equals(name, m.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return "Manager: " + name + " (ID: " + id + ")";
    }
}

public class Problem8 {
    public static void main(String[] args) {

        Map<Manager, TreeMap<Level, List<Employees>>> hierarchy = new HashMap<>();

        Manager m1 = new Manager(101, "Rajiv Sharma");
        Manager m2 = new Manager(102, "Anjali Rao");


        add(hierarchy, m1, Level.JUNIOR, new Employees(201, "Aarav Singh"));
        add(hierarchy, m1, Level.MID, new Employees(202, "Neha Verma"));
        add(hierarchy, m1, Level.MID, new Employees(203, "Vikram Patel"));
        add(hierarchy, m1, Level.SENIOR, new Employees(204, "Tanvi Mehta"));

        add(hierarchy, m2, Level.INTERN, new Employees(205, "Kunal Joshi"));
        add(hierarchy, m2, Level.JUNIOR, new Employees(206, "Divya Kapoor"));
        add(hierarchy, m2, Level.SENIOR, new Employees(207, "Rohan Desai"));

        printHierarchy(hierarchy);
    }

    static void add(Map<Manager, TreeMap<Level, List<Employees>>> map,
                    Manager m, Level level, Employees emp) {
        map.computeIfAbsent(m, k -> new TreeMap<>())
                .computeIfAbsent(level, k -> new ArrayList<>())
                .add(emp);
    }

    static void printHierarchy(Map<Manager, TreeMap<Level, List<Employees>>> map) {

        for (Manager m : map.keySet()) {
            System.out.println("Manager: " + m);
            TreeMap<Level, List<Employees>> levelMap = map.get(m);
            for (Level lvl : levelMap.keySet()) {
                System.out.println("  " + lvl + ":");
                for (Employees e : levelMap.get(lvl)) {
                    System.out.println("    " + e);
                }
            }
            System.out.println();
        }
    }
}
