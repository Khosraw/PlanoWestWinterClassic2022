package me.khosraw;

import java.util.ArrayList;
import java.util.Scanner;

public class SkiScare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> values = new ArrayList<>();
            int total = 0, x = in.nextInt(), y = in.nextInt(), prev = 3;

            values.add(2);
            while (values.size() <= y) {
                if (isPrime(prev)) values.add(prev);
                prev++;
            }

            for (int j = x-1; j <= y-1; j++) total += values.get(j);

            System.out.println("$" + total);
        }
    }

    public static boolean isPrime(int k) {
        if (k % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(k); i+=2) if (k % i == 0) return false;

        return true;
    }
}
