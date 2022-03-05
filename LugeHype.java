package me.khosraw;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Scanner;

public class LugeHype {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine()), month1, month2, day1, day2;

        for (int i = 0; i < n; i++) {
            String dates = in.nextLine(), m1 = dates.substring(0, 3), m2 = dates.substring(7, 10);

            DateTimeFormatter parser = DateTimeFormatter.ofPattern("MMM")
                    .withLocale(Locale.ENGLISH);
            month1 = parser.parse(m1).get(ChronoField.MONTH_OF_YEAR);
            month2 = parser.parse(m2).get(ChronoField.MONTH_OF_YEAR);

            day1 = Integer.parseInt(dates.substring(4, 6));
            day2 = Integer.parseInt(dates.substring(11));

            int d1 = day1, d2 = day2;

            for (int j = 1; j < month1; j++) {
                if (j >= 8) {
                    if (j % 2 == 0) d1 += 31;
                    else d1 += 30;
                } else {
                    if (j % 2 != 0) d1 += 31;
                    else if (j == 2) d1 += 28;
                    else d1 += 30;
                }
            }

            for (int j = 1; j < month2; j++) {
                if (j >= 8) {
                    if (j % 2 == 0) d2 += 31;
                    else d2 += 30;
                } else {
                    if (j % 2 != 0) d2 += 31;
                    else if (j == 2) d2 += 28;
                    else d2 += 30;
                }
            }

            double result = 365 - (365 * (Math.log(d2-d1+1)/Math.log(365)));

            System.out.printf("%.3f\n", result);
        }
    }
}
