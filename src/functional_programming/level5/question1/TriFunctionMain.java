
//Create your own functional interface called TriFunction<T, U, V, R> (takes 3 args).

package functional_programming.level5.question1;

public class TriFunctionMain {

    public static void main(String[] args) {
        TriFunction<String,String,String,String> concatThree = (a,b,c)->a+b+c;
        System.out.println(concatThree.apply("Aman ","Verma ","Dhar"));
    }


}
