
// Implement a text analyzer: given a paragraph, split into words, count frequency of each word, and return a map.

package functional_programming.level11.question1;

import java.util.*;
import java.util.stream.Collectors;

public class TextAnalyzer {

    public static void main(String[] args) {
        String para = "A paragraph is a distinct section of writing that focuses on a single idea or topic, typically consisting of several related sentences.";

       Map<String,Long> wordFrequency =  Arrays.stream(para.toLowerCase().
                replaceAll("[^a-z\\s]", "")
                .split("\\s+"))
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));


        wordFrequency.forEach((word, count) ->
                System.out.println(word + " → " + count));
    }
}
