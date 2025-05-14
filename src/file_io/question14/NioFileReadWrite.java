
//14️ Write a program that uses NIO (Files class) to read and write
//data between files with proper exception handling.

package file_io.question14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class NioFileReadWrite {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("files/input.txt");       // Source file
        Path destinationPath = Paths.get("files/output.txt"); // Destination file

        try {
            // Read all lines from the source file
            List<String> lines = Files.readAllLines(sourcePath);

            // Write the same lines to the destination file
            Files.write(destinationPath, lines);

            System.out.println("File copied successfully using NIO!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
