package Algorithms.DynamicProgramming;

import java.util.Scanner;

/**
 * Created by kashishsinghal on 17/09/16.
 * https://www.hackerrank.com/challenges/stockmax
 */
public class StockMaximize {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n;
            long profit = 0;
            n  = sc.nextInt();
            int[] prices = new int[n];

            for(int i =0; i<n;i++) {
                prices[i] = sc.nextInt();
            }
            int currMax = Integer.MIN_VALUE;
            for (int j =n-1;j>=0;j--) {
                if(prices[j] > currMax) {
                    currMax = prices[j];
                }
                profit += (currMax - prices[j]);
            }
            System.out.println(profit);
        }

    }
}
