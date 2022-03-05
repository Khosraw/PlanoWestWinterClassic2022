package me.khosraw;

import java.util.Scanner;

public class KarlingScores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), k = in.nextInt();
        double r = in.nextDouble();
        int centerX = in.nextInt(), centerY = in.nextInt(), trueScore1 = 0, trueScore2 = 0, winnerScore = 0;
        double distance1, distance2;

        for (int i = 0; i < n; i++) {
            distance1 = Math.sqrt(Math.pow(in.nextInt()-centerX, 2) + Math.pow(in.nextInt()-centerY, 2));
            distance2 = Math.sqrt(Math.pow(in.nextInt()-centerX, 2) + Math.pow(in.nextInt()-centerY, 2));

            if (distance1 < r) trueScore2++;
            else if (distance2 < r) trueScore1++;

            if (distance1 > distance2) trueScore2++;
            else trueScore1++;
        }

        if (trueScore1 > trueScore2) winnerScore = trueScore1;
        else winnerScore = trueScore2;

        if (winnerScore == k) System.out.println("YAY KARL U GOT IT!");
        else System.out.println("Karl...get some practice");
    }
}
