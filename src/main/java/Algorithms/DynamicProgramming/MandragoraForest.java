package Algorithms.DynamicProgramming;

/**
 * Created by kashishsinghal on 14/09/16.
 * https://www.hackerrank.com/challenges/mandragora
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MandragoraForest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = in.nextInt();
            List<Long> healths = new ArrayList();
            for (int i = 0; i < n; i++) {
                healths.add(in.nextLong());
            }
            Collections.sort(healths);
            long maxExp = 0;
            long totalHealth = 0;
            long totalStrength = n + 1;
            for (int i = n - 1; i >= 0; i--) {
                totalStrength--;
                totalHealth += healths.get(i);
                long exp = totalStrength * totalHealth;
                if (exp > maxExp) {
                    maxExp = exp;
                }
            }
            System.out.println(maxExp);
        }
    }
}