package me.khosraw;

import java.util.Scanner;

public class LookAtTheTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String attend, arrival, player, times;

        for (int i = 0; i < n; i++) {
            int hoursLate, minutesLate;
            StringBuilder output = new StringBuilder();
            player = in.nextLine();
            times = in.nextLine();
            attend = times.substring(0, times.indexOf(' '));
            arrival = times.substring(times.indexOf(' ')+1);

            if (attend.equals(arrival)) {
                System.out.println(player + " was on time.");
                continue;
            }

            hoursLate = Integer.parseInt(arrival.substring(0, arrival.indexOf(':'))) - Integer.parseInt(attend.substring(0, arrival.indexOf(':')));
            minutesLate = Integer.parseInt(arrival.substring(arrival.indexOf(':')+1)) - Integer.parseInt(attend.substring(arrival.indexOf(':')+1));

            if (hoursLate == 0 && minutesLate < 0) hoursLate = 23 + hoursLate;
            else if (hoursLate < 0 || minutesLate < 0) hoursLate = 24 + hoursLate;
            if (minutesLate < 0) minutesLate = 60 + minutesLate;

            output.append(player).append(" was ");

            if (hoursLate == 1) output.append("1 hour ");
            else if (hoursLate != 0) output.append(hoursLate).append(" hours ");

            if (minutesLate == 1 && hoursLate == 0) output.append("1 minute");
            else if (hoursLate == 0) output.append(minutesLate).append(" minutes ");
            else if (minutesLate == 1) output.append("and 1 minute ");
            else if (minutesLate != 0) output.append("and ").append(minutesLate).append(" minutes ");

            output.append("late.");

            System.out.println(output);
        }
    }
}
