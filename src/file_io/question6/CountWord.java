
//Write a program to read all the words from paragraph.txt and
//count how many times the word "Java" appears.

package file_io.question6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CountWord {
    public static void main(String[] args) {

        String fileName = "files/paragraph.txt";
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equals("Java")) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"Java\" appears " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
