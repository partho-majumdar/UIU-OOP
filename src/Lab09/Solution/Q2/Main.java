package Lab09.Solution.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        System.out.println("Enter total number of player: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            players.add(new Player(input.next(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()));
        }

        Collections.sort(players);

        for (Player p : players) {
            System.out.println(p.toString());
        }
    }
}
