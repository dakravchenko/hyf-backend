package com.player;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("a", 500, 30);
        Player p2 = new Player("b", 500, 30);
        Player p3 = new Player("c", 520, 37);
        Player p4 = new Player("d", 499, 37);
        Player p5 = new Player("e", 499, 39);
        Player p6 = new Player("f", 4530, 39);

        Player[] players = new Player[] { p1, p2, p3, p4, p5, p6 };

        for (int i = 0; i < players.length; i++) {
            System.out.print("#" + (i + 1) + players[i]);
            System.out.println();
        }

        Arrays.sort(players);

        for (int i = 0; i < players.length; i++) {
            System.out.print("#" + (i + 1) + players[i]);
            System.out.println();
        }

    }
}
