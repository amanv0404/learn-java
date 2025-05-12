

//Write a Predicate<String> that returns true if a string starts with “A”.

package functional_programming.level1.question1;

import java.util.function.Predicate;

//Predicate<T>: A functional interface that takes an input of type T and returns a boolean result.

public class PredicateUse {
    public static void main(String[] args) {

        // predicate returns boolean values
        Predicate<String> checkStringStartsWithA = x->x.toLowerCase().startsWith("a");

        System.out.println(checkStringStartsWithA.test("Aman"));
    }
}
