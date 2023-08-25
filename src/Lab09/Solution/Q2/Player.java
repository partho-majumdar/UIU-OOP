package Lab09.Solution.Q2;

import java.util.Calendar;

public class Player implements Comparable<Player> {
    private String name;
    private int score;
    private Calendar dateOfBirth;

    public Player(String name, int score, int day, int month, int year) {
        this.name = name;
        this.score = score;
        this.dateOfBirth = Calendar.getInstance();
        this.dateOfBirth.set(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", score=" + score + ", " + this.dateOfBirth.getTime() + "]";
    }

    public int compareTo(Player p) {
        if (this.score < p.score) return 1;
        else if (this.score == p.score) {
            if (this.name.compareTo(p.name) > 0) return 1;
            else if (this.name.compareTo(p.name) == 0) {
                return this.dateOfBirth.compareTo(p.dateOfBirth);
            } else return -1;
        } else return -1;
    }
}
