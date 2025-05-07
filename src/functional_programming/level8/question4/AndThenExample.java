
// Implement compose() and andThen() examples using Function<T, R>.

package functional_programming.level8.question4;

import java.util.function.Function;

public class AndThenExample {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add10 = x -> x + 10;

        Function<Integer,Integer> multiplyThenAdd = multiplyBy2.andThen(add10);
        int result = multiplyThenAdd.apply(5);
        System.out.println("Result: "+result);



    }
}











