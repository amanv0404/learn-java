
//Write a program to list all files and directories in a folder called
//        documents.


package file_io.question10;
import java.io.File;

public class ListDocument {
    public static void main(String[] args) {
        File folder = new File("files");

        if (folder.exists() && folder.isDirectory()) {
            File[] items = folder.listFiles();

            if (items != null && items.length > 0) {
                System.out.println("Contents of 'files' folder:");
                for (File item : items) {
                    if (item.isDirectory()) {
                        System.out.println("[DIR]  " + item.getName());
                    } else {
                        System.out.println("[FILE] " + item.getName());
                    }
                }
            } else {
                System.out.println("The folder is empty.");
            }
        } else {
            System.out.println("'documents' folder does not exist or is not a directory.");
        }
    }
}
