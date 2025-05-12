package file_io.question16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileWithArgument {
    public static void main(String[] args) {
        // Check if filename is provided via command-line
        if (args.length != 1) {
            System.out.println("Usage: java CreateFileWithArgument <filename>");
            return;
        }

        String filename = args[0];
        String content = "This is my first file in Java.";

        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("File '" + filename + "' has been created and written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
