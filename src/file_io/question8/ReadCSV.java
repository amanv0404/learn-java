
//Write a program that reads a CSV file named employees.csv
//and prints each line in uppercase.


// Write a program that reads a CSV file named employees.csv
//        and prints each line in uppercase.


package file_io.question8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String fileName = "files/employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase()); // Convert line to uppercase
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
