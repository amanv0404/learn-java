
// Given a list of URLs (strings), use streams to validate them using a Predicate<String> and return only valid ones.

package functional_programming.level10.question2;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList(
                "https://google.com",
                "ftp://example.com",
                "invalid-url",
                "http://openai.com",
                "justtext"
        );

        Predicate<String> isValidUrl = x->x.matches("^(https?|ftp)://[^\\s]+$");

        List<String> validUrls = urls.stream().filter(isValidUrl).toList();

        System.out.println("Valid Urls: "+validUrls);


    }
}
