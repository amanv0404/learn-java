
//Compose two functions: one that converts string to uppercase and one that appends “!”.

package functional_programming.level4.question2;

import java.util.function.Function;

public class FunctionCompose {

    public static void main(String[] args) {
        Function<String,String> toUpperCase = s->s.toUpperCase();

        Function<String,String> addExclamation = s->s+"!";

        Function<String,String> addCompose = toUpperCase.andThen(addExclamation);

        String result = addCompose.apply("aman");
        System.out.println("Result: "+result);
    }
}
