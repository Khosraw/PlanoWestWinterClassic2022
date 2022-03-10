package me.khosraw;

import java.util.ArrayList;
import java.util.Scanner;

public class SpeedSkatingSafety {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int l = in.nextInt(), j = in.nextInt(), p = in.nextInt(), total = p, term = 1;
            ArrayList<Integer> arithmetic = new ArrayList<>();
            ArrayList<Integer> prime = new ArrayList<>();
            prime.add(p);
            arithmetic.add(l);

            while (total < 1000000) {
                total += p;
                prime.add(total);
            }

            while (l < 1000000) {
                l += j;
                arithmetic.add(l);
            }

            for (int k : arithmetic) {
                if (binarySearch(k, prime)) {
                    System.out.println(term);
                    break;
                }
                else term++;
            }
        }

        System.out.println("PERFERRED PATH");
    }

    public static boolean binarySearch(int k, ArrayList<Integer> prime) {
        int start = 0, end = prime.size()-1, mid = (prime.size()-1)/2;
        boolean found = false;

        while (!found && end > start) {
            if (prime.get(mid) == k) found = true;
            else if (prime.get(mid) < k) {
                start = mid+1;
                mid = (end + start)/2;
            } else {
                end = mid-1;
                mid = (end + start)/2;
            }
        }

        return found;
    }
}
