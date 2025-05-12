

//Problem 12: Voting System (Map<String, Integer>)
//        Build a voting system that:
//        • Tallies votes per candidate
//        • Sorts by vote count descending


package collections;

import java.util.*;
public class Problem12 {
    public static void main(String[] args) {

        Map<String, Integer> voteMap = new HashMap<>();

        String[] votes = {
                "Aman", "Ironman", "Spiderman", "Ironman", "Aman",
                "Ironman", "Spiderman", "Aman",
        };

        // tally votes
        for (String candidate : votes) {
            voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedVotes = new ArrayList<>(voteMap.entrySet());

        sortedVotes.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Election Results (sorted by votes):");
        for (Map.Entry<String, Integer> entry : sortedVotes) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }

    }
}
