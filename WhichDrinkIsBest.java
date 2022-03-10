package me.khosraw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhichDrinkIsBest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] drinks = {in.nextLine(), in.nextLine(), in.nextLine()};

        String find = in.nextLine(), match;

        for (String drink : drinks) {
            match = drink.split(" ")[0] + drink.split(" ")[1];

            Pattern pattern = Pattern.compile(match.toLowerCase());

            Matcher matcher = pattern.matcher(find.toLowerCase());

            if (matcher.find()) {
                System.out.println(drink);
                return;
            }
        }

        System.out.println("No Gatorade Found");
    }
}