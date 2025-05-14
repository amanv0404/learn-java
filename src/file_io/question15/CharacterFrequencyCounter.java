//15️ Write a program that reads a text file and counts the frequency of
//        each character (including spaces and punctuation). Print the result to a
//        file named charcount.txt.


package file_io.question15;

import java.io.*;
import java.util.*;

public class CharacterFrequencyCounter {

    public static void main(String[] args) {
        String inputFile = "files/input.txt";
        String outputFile = "files/charcount.txt";

        Map<Character, Integer> charFrequency = new HashMap<>();

        // Read characters and count frequencies
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }


        // Write frequencies to output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                writer.write("'" + entry.getKey() + "' : " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Character frequency written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing the file: " + e.getMessage());
        }

    }
}
