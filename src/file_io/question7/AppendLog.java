
//Write a program to append the line “Last updated on [current
//date]” to an existing file log.txt.

package file_io.question7;


//Write a program to append the line “Last updated on [current
//        date]” to an existing file log.txt.

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class AppendLog {

    public static void main(String[] args) {
        String fileName = "files/log.txt";
        LocalDate currentDate = LocalDate.now();
        String lineToAppend = "Last updated on " + currentDate + "\n";

        try (FileWriter writer = new FileWriter(fileName, true)) { // true = append mode
            writer.write(lineToAppend);
            System.out.println("Log updated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
