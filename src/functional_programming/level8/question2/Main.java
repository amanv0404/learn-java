
// Compose two functions: one for string parsing (String -> Integer) and one for doubling the number (Integer -> Integer).

package functional_programming.level8.question2;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String,Integer> parse = Integer::parseInt;
        Function<Integer,Integer> doubleIt = x->x*2;

        Function<String,Integer> parseDouble = parse.andThen(doubleIt);

        int result = parseDouble.apply("21");
        System.out.println("Result: "+result);
    }
}
