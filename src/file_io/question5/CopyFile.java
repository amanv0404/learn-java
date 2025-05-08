
//Write a program that copies the contents of source.txt to a new
//file called backup.txt.

package file_io.question5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        String sourcePath = "files/source.txt";
        String backupPath = "files/backup.txt";

        try (
                FileReader reader = new FileReader(sourcePath);
                FileWriter writer = new FileWriter(backupPath)
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch); // write each character to backup.txt
            }
            System.out.println("File copied successfully.");
        } catch (IOException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }

    }
}
