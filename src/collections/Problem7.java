

//Problem 7: Movie Rating Aggregator (Map, List)
//Users rate movies between 1-5.
//        • Store movie name -> list of ratings.
//• Compute and display average rating per movie sorted descending.

package collections;
import java.util.*;
import java.util.stream.Collectors;

public class Problem7 {
    public static void main(String[] args) {

        // movie -- list of ratings
        Map<String, List<Integer>> movieRatings = new HashMap<>();

        addRating(movieRatings, "Inception", 5);
        addRating(movieRatings, "Inception", 4);
        addRating(movieRatings, "The Matrix", 5);
        addRating(movieRatings, "The Matrix", 4);
        addRating(movieRatings, "The Matrix", 5);
        addRating(movieRatings, "Interstellar", 5);
        addRating(movieRatings, "Interstellar", 5);
        addRating(movieRatings, "Interstellar", 4);
        addRating(movieRatings, "The Dark Knight", 5);
        addRating(movieRatings, "The Dark Knight", 5);
        addRating(movieRatings, "The Dark Knight", 5);
        addRating(movieRatings, "Avatar", 3);
        addRating(movieRatings, "Avatar", 4);
        addRating(movieRatings, "Tenet", 2);
        addRating(movieRatings, "Tenet", 3);


        // compute average ratings and sort
        Map<String, Double> averageRatings = new HashMap<>();

        movieRatings.forEach((movie, ratings) ->
                averageRatings.put(movie, ratings.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)));



        // sort and print by descending average rating
        averageRatings.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> {
                    System.out.printf("%-20s Average Rating: %.2f%n", entry.getKey(), entry.getValue());
                });
    }

    private static void addRating(Map<String, List<Integer>> map, String movie, int rating) {
        map.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }
}
