
//Use a Consumer<String> to print a string in uppercase.

package functional_programming.level1.question3;

import java.util.function.Consumer;

//Consumer<T>: A functional interface that takes an input of type T and performs an action without returning a result.

public class ConsumerUse {
    public static void main(String[] args) {

        Consumer<String> printStringUppercase = x-> System.out.println(x.toUpperCase());
        printStringUppercase.accept("aman");
    }
}
