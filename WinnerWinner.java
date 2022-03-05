package me.khosraw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WinnerWinner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int highest = 0;
        HashMap<Integer, String> players = new HashMap<>();

        String str, winner = null;
        while (in.hasNext()) {
            str = in.nextLine();
            players.put(Integer.parseInt(str.substring(0, str.indexOf(" "))), str.substring(str.indexOf(" ") + 1));
        }

        for (Map.Entry<Integer, String> mapElement : players.entrySet()) {
            if (highest < mapElement.getKey()) winner = mapElement.getValue();
        }

        System.out.println(winner);
    }
}
