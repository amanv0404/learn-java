//
//12️ Write a program that reads all .txt files in a folder and merges
//        their contents into a single file named merged.txt.

package file_io.question12;

import java.io.*;

public class MergeTextFiles {

    public static void main(String[] args) {
        File folder = new File("files");

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("No .txt files found in the folder.");
            return;
        }

        File mergedFile = new File("files/merged.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {
            for (File file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    writer.write("===== " + file.getName() + " =====\n");
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                    writer.newLine();
                }
            }
            System.out.println("All .txt files have been merged into merged.txt.");
        } catch (IOException e) {
            System.out.println("Error during merging: " + e.getMessage());
        }
    }
}










