//
//3️ Exception-safe resource handling with multiple
//        resources
//Write a program that opens two files (BufferedReader and
//BufferedWriter), reads from one, and writes to the other.
//Use try-with-resources to ensure both are closed safely, even if
//exceptions occur in the middle.

package exception.question3;

import java.io.*;

public class FileCopySafe {
    public static void main(String[] args) {

        String inputFile = "files/input.txt";
        String outputFile = "files/output.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
