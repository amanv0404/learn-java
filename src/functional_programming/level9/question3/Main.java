
// From a list of comments, count the number of comments by each user.

package functional_programming.level9.question3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Comment> comments = new ArrayList<>(Arrays.asList(
                new Comment("Aman", "Nice post!"),
                new Comment("Yash", "Interesting."),
                new Comment("Ben", "Thanks for sharing."),
                new Comment("Aman", "Great read."),
                new Comment("Ironman", "Loved it. 3000"),
                new Comment("Yash", "Awesome!")
        ));

        Map<String,Long> commentsCountByUser = comments.stream().collect(Collectors.groupingBy(
                Comment::getUser,
                Collectors.counting()
        ));

        commentsCountByUser.forEach((user, count) ->
                System.out.println(user + " → " + count));




    }
}
