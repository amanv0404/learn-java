
//Create a function that takes a list of people and returns a map of age group (<20, 20-40, 40+) → list of people.

package functional_programming.level7.question4;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static Map<String, List<Person>> groupByAge(List<Person> people) {

            return people.stream().collect(Collectors.groupingBy(
                person->{
                    int age = person.getAge();
                    if(age < 20) return "<20";
                    else if(age <=40) return "20-40";
                    else return "40";
                }
        ));

    }
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Aman",24),
                new Person("Yash",27),
                new Person("Ironman",33),
                new Person("Spiderman",18),
                new Person("Loki",45)
        ));

        Map<String, List<Person>>  grouped = groupByAge(list);

        grouped.forEach((ageGroup, persons) -> {
            System.out.println(ageGroup + " → " + persons);
        });



    }
}
