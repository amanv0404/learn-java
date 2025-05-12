
// From a list of dates, return the earliest and latest date using a custom comparator and stream operations.


package functional_programming.level11.question3;
import java.time.LocalDate;
import java.util.*;

public class DateRange {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 5, 10),
                LocalDate.of(2022, 8, 20),
                LocalDate.of(2024, 1, 15),
                LocalDate.of(2021, 12, 5)
        );

        Comparator<LocalDate> comparator = Comparator.naturalOrder();

        Optional<LocalDate> earliest = dates.stream().min(comparator);
        Optional<LocalDate> latest = dates.stream().max(comparator);

        System.out.println("Earliest date: " + earliest.orElse(null));
        System.out.println("Latest date: " + latest.orElse(null));
    }
}
