
// Build a reusable pipeline of 3 functions: trim, lowercase, and remove punctuation from strings.

package functional_programming.level8.question1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,String> trim = String::trim;
        Function<String,String> toLower = String::toLowerCase;
        Function<String,String> removePuntuation = s->s.replaceAll("\\p{Punct}", "");

        Function<String,String> cleanPipline = trim.andThen(toLower).andThen(removePuntuation);

        String input = "  Hello, World!  ";
        String result = cleanPipline.apply(input);

        System.out.println(result);


    }
}
