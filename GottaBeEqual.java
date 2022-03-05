package me.khosraw;

import java.util.ArrayList;
import java.util.Scanner;

public class GottaBeEqual {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), total = 0, count = 0;
        ArrayList<Integer> weights = new ArrayList<>();

        for (int i = 0; i < n; i++) weights.add(in.nextInt());
        for (int w : weights) total += w;

        int W = 0;
        for (int w : weights) {
            W += w;
            count++;
            if (total / W == 2) {
                if (count > 1) System.out.println("Woohoo let's split it! Put " + count + " trophies on the first freight car.");
                else System.out.println("Woohoo let's split it! Put 1 trophy on the first freight car.");

                System.exit(1);
            }
        }

        System.out.println("Looks like we're spending extra money on fuel.");
    }
}
