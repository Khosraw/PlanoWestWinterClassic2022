package me.khosraw;

import java.util.ArrayList;
import java.util.Scanner;

public class InclinedRamp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Double g = in.nextDouble();
        int n = in.nextInt();
        ArrayList<Double> masses = new ArrayList<>();
        ArrayList<Double> angles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            masses.add(in.nextDouble());
            angles.add(in.nextDouble());
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\n", masses.get(i) * g * Math.sin(Math.toRadians(angles.get(i))));
        }
    }
}
