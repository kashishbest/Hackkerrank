package Algorithms.DynamicProgramming;

import java.util.Scanner;

/**
 * Created by kashishsinghal on 16/09/16.
 * https://www.hackerrank.com/challenges/red-john-is-back
 */
public class RedJohnIsBack {

    static int findNoOfPrimesLessThanN(int n) {
        int res = 0;
        for (int number = 2; number <= n; number++) {
            if (number == 2) {
                res++;
                continue;
            }

            boolean found = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    found=false;
                }
            }
            if (found) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] solutions = new int[n+1];
            solutions[0] = 1;
            for (int i = 1; i < n + 1; i++) {
                solutions[i] = solutions[i - 1];
                if (i - 4 >= 0) {
                    solutions[i] += solutions[i - 4];
                }
            }
            System.out.println(findNoOfPrimesLessThanN(solutions[n]));
        }
    }
}
