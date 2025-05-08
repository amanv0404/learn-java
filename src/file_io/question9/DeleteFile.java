
// Write a program to delete a file named oldfile.txt if it exists.

package file_io.question9;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        File file = new File("files/oldfile.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
