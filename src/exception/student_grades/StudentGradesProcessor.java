
package exception.student_grades;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StudentGradesProcessor {
    public static void main(String[] args) {
        String fileName = "files/grades.txt";

        Map<String, Integer> validGrades = new LinkedHashMap<>();
        List<String> failingStudents = new ArrayList<>();
        int total = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            try {
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\s+");

                    if (parts.length != 2) {
                        System.out.println("Skipping malformed line: " + line);
                        continue;
                    }

                    String name = parts[0];
                    String gradeStr = parts[1];

                    try {
                        int grade = Integer.parseInt(gradeStr);

                        if (grade < 0 || grade > 100) {
                            throw new InvalidGradeException("Grade out of range for " + name + ": " + grade);
                        }

                        validGrades.put(name, grade);
                        total += grade;

                        if (grade < 40) {
                            failingStudents.add(name);
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format for student " + name + ": " + gradeStr);
                    } catch (InvalidGradeException e) {
                        System.out.println(e.getMessage());
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + fileName);
                return;
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
                return;
            }
        } catch (IOException e) {
            System.out.println("Error closing the file: " + e.getMessage());
        }


        System.out.println("\n--- Valid Student Grades ---");
        if (validGrades.isEmpty()) {
            System.out.println("No valid grades found.");
        } else {
            for (Map.Entry<String, Integer> entry : validGrades.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("\n--- Failing Students (<40) ---");
            if (failingStudents.isEmpty()) {
                System.out.println("None");
            } else {
                for (String name : failingStudents) {
                    System.out.println(name);
                }
            }

            double average = (double) total / validGrades.size();
            System.out.printf("\nAverage Grade: %.2f\n", average);
        }


    }
}
