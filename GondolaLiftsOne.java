package me.khosraw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GondolaLiftsOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), start = in.nextInt(), destination = in.nextInt(), count = 0, entries = 0;
        HashMap<Integer, ArrayList<Integer>> paths = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = in.nextInt();
            if (!paths.containsKey(key)) paths.put(key, new ArrayList<>());

            entries++;
            paths.get(key).add(in.nextInt());
        }

        while (destination != start) {
            if (count > entries*2) {
                System.out.println("No, but you can walk!");
                return;
            }
            destination = getPath(paths, destination);
            count++;
        }

        System.out.println("YESSIREE");
    }

    public static int getPath (HashMap<Integer, ArrayList<Integer>> paths, int destination) {
        for (Map.Entry<Integer, ArrayList<Integer>> entry : paths.entrySet()) {
            for (int value : entry.getValue()) {
                if (value == destination) return entry.getKey();
            }
        }
        return -1;
    }
}
