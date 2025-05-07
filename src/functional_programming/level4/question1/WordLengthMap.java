
// Write a function that takes a list of strings and returns a map of word to its length.

package functional_programming.level4.question1;

import java.util.*;
import java.util.stream.Collectors;

public class WordLengthMap {

    public static Map<String, Integer> mapWordsToLength(List<String> words) {

        return words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> word.length()
                ));
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Lambda");

        Map<String,Integer> mp = mapWordsToLength(words);
        System.out.println(mp);
    }
}
