
// Given a list of people (name, age), filter adults (age > 18) and collect names.

package functional_programming.level4.question4;

import java.util.*;

public class FilterAdults {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Aman",24),
                new Person("Spideran",18),
                new Person("Ironman",33)
        );

        List<String> adultNames = list.stream().filter(x->x.age>18).map(x->x.name).toList();
        System.out.println("Result: "+adultNames);




    }
}
