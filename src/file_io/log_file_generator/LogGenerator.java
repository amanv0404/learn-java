package file_io.log_file_generator;

import java.io.*;

public class LogGenerator {
    public static void main(String[] args) {

        String inputFile = "files/server.log";
        String outputFile = "files/summary.txt";

        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                totalLines++;

                if (line.contains("ERROR")) {
                    errorCount++;
                }

                if (line.contains("WARNING")) {
                    warningCount++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file '" + inputFile + "' not found.");
            return;
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        double errorPercent = (totalLines > 0) ? (errorCount * 100.0 / totalLines) : 0;
        double warningPercent = (totalLines > 0) ? (warningCount * 100.0 / totalLines) : 0;


        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)))) {
            writer.println("Log Summary Report");
            writer.println("------------------");
            writer.println("Total log entries: " + totalLines);
            writer.println("ERROR entries: " + errorCount + String.format(" (%.2f%%)", errorPercent));
            writer.println("WARNING entries: " + warningCount + String.format(" (%.2f%%)", warningPercent));
            System.out.println("Summary written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}
