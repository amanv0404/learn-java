

//Create a Function<String, Integer> that returns the length of a string.

package functional_programming.level1.question2;
import java.util.Scanner;
import java.util.function.Function;

//Function<T, R>: A functional interface that takes an input of type T and returns a result of type R.

public class FunctionUse {
    public static void main(String[] args) {

        Function<String,Integer> lengthOfString = x->x.length();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Length of string: "+str+" is: "+lengthOfString.apply(str));

    }
}
