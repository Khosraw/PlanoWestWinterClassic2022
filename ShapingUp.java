package me.khosraw;

import java.util.*;

public class ShapingUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer.parseInt(in.nextLine());

        ArrayList<String> shapes = new ArrayList<>(Arrays.asList(in.nextLine().split("")));

        int sequences = 0;
        for (int i = 0; i < shapes.size()-2; i++) if (Objects.equals(shapes.get(i), "T")) for (int j = i + 1; j < shapes.size()-1; j++) if (Objects.equals(shapes.get(j), "C")) for (int k = j + 1; k < shapes.size(); k++) if (Objects.equals(shapes.get(k), "S")) sequences++;

        System.out.println(sequences);
    }
}