
//Problem 15: College Subject Allotment (Map<String, List<String>>)
//        • Store which subjects are allotted to each student
//        • Provide reverse lookup: which students chose a specific subject


package collections;
import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        Map<String, List<String>> studentSubjects = new HashMap<>();

        studentSubjects.put("Aarav", Arrays.asList("Math", "Physics"));
        studentSubjects.put("Neha", Arrays.asList("Chemistry", "Biology"));
        studentSubjects.put("Ravi", Arrays.asList("Math", "Biology"));
        studentSubjects.put("Sneha", Arrays.asList("Physics", "Chemistry"));
        studentSubjects.put("Karan", Arrays.asList("Math", "Biology"));

        // reverse map: subject -> list of students
        Map<String, List<String>> subjectStudents = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : studentSubjects.entrySet()) {
            String student = entry.getKey();
            for (String subject : entry.getValue()) {
                subjectStudents.computeIfAbsent(subject, k -> new ArrayList<>()).add(student);
            }
        }

        // subjects allotted to each student
        System.out.println("Subjects allotted to each student:");
        for (var entry : studentSubjects.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nStudents per subject (reverse lookup):");
        for (var entry : subjectStudents.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
