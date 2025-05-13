
//Problem 9: Leaderboard Tracker (TreeSet, Comparator)
//Track player scores using TreeSet<Player> sorted by score descending.
//• Update a player's score and maintain correct leaderboard order.


package collections;

import java.util.*;

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    // used for TreeSet sorting: by score descending, then name
    public static Comparator<Player> comparator = Comparator
            .comparingInt(Player::getScore).reversed()
            .thenComparing(Player::getName);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return name + ": " + score;
    }

}

class Leaderboard {

    private TreeSet<Player> leaderboard;

    public Leaderboard() {
        leaderboard = new TreeSet<>(Player.comparator);
    }

    // add or update a player's score
    public void updateScore(String name, int newScore) {
        Player temp = new Player(name, 0);
        if (leaderboard.contains(temp)) {
            leaderboard.remove(temp);
        }
        leaderboard.add(new Player(name, newScore));
    }

    public void printLeaderboard() {
        for (Player p : leaderboard) {
            System.out.println(p);
        }
    }

}
public class Problem9 {
    public static void main(String[] args) {

        Leaderboard lb = new Leaderboard();

        lb.updateScore("Aarav", 100);
        lb.updateScore("Neha", 120);
        lb.updateScore("Karan", 90);
        lb.updateScore("Aarav", 130);  // Update Aarav's score

        System.out.println("Leaderboard:");
        lb.printLeaderboard();
    }
}
