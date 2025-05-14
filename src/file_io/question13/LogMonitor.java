
//13️ Write a program that monitors a log file (server.log) and
//    prints only the lines that contain the word "ERROR".

package file_io.question13;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LogMonitor {
    public static void main(String[] args) {
        File logFile = new File("files/server.log");

        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;

            // Keep reading the file line by line
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    // Print only error lines
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading log file: " + e.getMessage());
        }
    }
}
