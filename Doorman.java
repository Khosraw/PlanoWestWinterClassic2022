package me.khosraw;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Doorman {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");

        StringBuilder time = new StringBuilder();
        String[][] input = new String[5][18];

        for (int i = 0; i < 5; i++) {
            String[] str = in.nextLine().split("");

            System.arraycopy(str, 0, input[i], 0, 18);
        }

        int padding = 0;
        for (int i = 0; i < 4; i++) {
            if (i == 2) time.append(":");

            if (Objects.equals(input[1][2+padding], "_") && Objects.equals(input[2][1+padding], "|") && Objects.equals(input[2][3+padding], "|") && Objects.equals(input[3][1+padding], "|") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], "_") && Objects.equals(input[2][2+padding], " ")) time.append(0);
            else if (Objects.equals(input[1][2+padding], " ") && Objects.equals(input[2][1+padding], " ") && Objects.equals(input[2][3+padding], "|") && Objects.equals(input[3][1+padding], " ") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], " ") && Objects.equals(input[2][2+padding], " ")) time.append(1);
            else if (Objects.equals(input[1][2+padding], "_") && Objects.equals(input[2][1+padding], " ") && Objects.equals(input[2][3+padding], "|") && Objects.equals(input[3][1+padding], "|") && Objects.equals(input[3][3+padding], " ") && Objects.equals(input[3][2+padding], "_") && Objects.equals(input[2][2+padding], "_")) time.append(2);
            else if (Objects.equals(input[1][2+padding], "_") && Objects.equals(input[2][1+padding], " ") && Objects.equals(input[2][3+padding], "|") && Objects.equals(input[3][1+padding], " ") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], "_") && Objects.equals(input[2][2+padding], "_")) time.append(3);
            else if (Objects.equals(input[1][2+padding], " ") && Objects.equals(input[2][1+padding], "|") && Objects.equals(input[2][3+padding], "|") && Objects.equals(input[3][1+padding], " ") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], " ") && Objects.equals(input[2][2+padding], "_")) time.append(4);
            else if (Objects.equals(input[1][2+padding], "_") && Objects.equals(input[2][1+padding], "|") && Objects.equals(input[2][3+padding], " ") && Objects.equals(input[3][1+padding], " ") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], "_") && Objects.equals(input[2][2+padding], "_")) time.append(5);
            else if (Objects.equals(input[1][2+padding], "_") && Objects.equals(input[2][1+padding], "|") && Objects.equals(input[2][3+padding], " ") && Objects.equals(input[3][1+padding], "|") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], "_") && Objects.equals(input[2][2+padding], "_")) time.append(6);
            else if (Objects.equals(input[1][2+padding], "_") && Objects.equals(input[2][1+padding], " ") && Objects.equals(input[2][3+padding], "|") && Objects.equals(input[3][1+padding], " ") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], " ") && Objects.equals(input[2][2+padding], " ")) time.append(7);
            else if (Objects.equals(input[1][2+padding], "_") && Objects.equals(input[2][1+padding], "|") && Objects.equals(input[2][3+padding], "|") && Objects.equals(input[3][1+padding], "|") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], "_") && Objects.equals(input[2][2+padding], "_")) time.append(8);
            else if (Objects.equals(input[1][2+padding], "_") && Objects.equals(input[2][1+padding], "|") && Objects.equals(input[2][3+padding], "|") && Objects.equals(input[3][1+padding], " ") && Objects.equals(input[3][3+padding], "|") && Objects.equals(input[3][2+padding], "_") && Objects.equals(input[2][2+padding], "_")) time.append(9);
            if (i == 1) padding += 4;
            else padding += 3;
        }

        if ((input[2][15] + input[2][16]).equals("pm")) time.append(" PM");
        else time.append(" AM");

        Date date = parseFormat.parse(String.valueOf(time));
        System.out.println(displayFormat.format(date));
    }
}
/*
******************
*    _   _  _    *
*  | _|.| | _| am*
*  ||_ .|_||_    *
******************
 */