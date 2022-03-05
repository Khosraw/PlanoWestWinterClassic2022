package me.khosraw;

import java.util.Scanner;

public class HowHighCanYouGo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        double result = (Math.pow(t, 3)/6075) - (Math.pow(t, 2)/45) + 60;

        System.out.printf("%.2f", result);
    }
}
