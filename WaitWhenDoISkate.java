package me.khosraw;

import java.util.*;

public class WaitWhenDoISkate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] skaters = in.nextLine().split(", ");
        ArrayList<String> lastnames = new ArrayList<>();

        for (String s : skaters) lastnames.add(s.split(" ")[1].substring(0, 1).toUpperCase() + s.split(" ")[1].toLowerCase().substring(1));

        Collections.sort(lastnames);

        StringBuilder order = new StringBuilder();
        for (String s : lastnames) if (!s.equals("Chen") && order.indexOf(s) == -1) order.append(s).append(" ");

        if (lastnames.contains("Chen")) order.append("Chen");

        System.out.println(order.substring(0, order.length()));
    }
}
