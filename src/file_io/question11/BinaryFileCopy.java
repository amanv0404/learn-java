
//11️ Write a program to read a binary file (e.g., image.jpg) and copy
//        its contents to image_copy.jpg.


package file_io.question11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileCopy {
    public static void main(String[] args) {
        String sourceFile = "files/image.jpg";
        String destinationFile = "files/image_copy.jpg";

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destinationFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}
