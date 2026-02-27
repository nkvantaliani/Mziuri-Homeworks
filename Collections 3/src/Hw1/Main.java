package Hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hooper> players = new ArrayList<>();

        players.add(new Hooper("nata", "kvat", 20, 10, 5, 3, 2));
        players.add(new Hooper("hooper1", "ertadze", 15, 7, 8, 1, 1));
        players.add(new Hooper("hooper2", "oradze", 25, 5, 4, 2, 4));
        players.add(new Hooper("hooper3", "samadze", 10, 12, 6, 4, 0));

        Collections.sort(players, new Comparator<Hooper>() {
            @Override
            public int compare(Hooper p1, Hooper p2) {
                return Double.compare(p2.getRating(), p1.getRating());
            }
        });

        for (Hooper p : players) {
            System.out.println(p);
        }

        Collections.sort(players, new Comparator<Hooper>() {
            @Override
            public int compare(Hooper p1, Hooper p2) {
                return Double.compare(p1.getRating(), p2.getRating());
            }
        });

        System.out.println();
        for (Hooper p : players) {
            System.out.println(p);
        }
    }
}
