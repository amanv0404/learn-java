//Problem 2: Unique Word Frequency Counter (Map, TreeSet)
//Given a paragraph, calculate and print:
//        • Number of unique words
//• Frequency of each word
//• Display words sorted alphabetically



package collections;
import java.util.*;


public class Problem2 {
    public static void main(String[] args) {
        String paragraph = "A framework is a set of classes and interfaces which provide a ready-made architecture. In order to implement a new feature or a class, there is no need to define a framework. However, an optimal object-oriented design always includes a framework with a collection of classes such that all the classes perform the same kind of task. ";

        // convert to lowercase and remove special char
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z\\s]", "");

        // split words into array of words
        String[] words = paragraph.split("\\s+");

        // count frequency
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        // display number of unique words
        System.out.println("Number of unique words: " + wordFreq.size());

        // sort words alphabetically using TreeSet
        Set<String> sortedWords = new TreeSet<>(wordFreq.keySet());

        // display frequency
        System.out.println("\nWord Frequencies (Alphabetical Order):");
        for (String word : sortedWords) {
            System.out.println(word + " : " + wordFreq.get(word));
        }
    }
}
