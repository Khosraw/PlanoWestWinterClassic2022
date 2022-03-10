package me.khosraw;

import java.util.Scanner;

public class HousingCrisis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), competitors = 1;

        for (int i = 1; i <= n-1; i++) competitors *= i;

        System.out.println(competitors % n);
    }
}
