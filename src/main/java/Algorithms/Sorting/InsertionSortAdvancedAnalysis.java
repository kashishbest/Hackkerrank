package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by kashishsinghal on 14/09/16.
 * https://www.hackerrank.com/challenges/insertion-sort
 */
public class InsertionSortAdvancedAnalysis {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] ar = new int[n];
            for (int j = 0; j < n; j++) {
                ar[j] = in.nextInt();
                //System.err.println(ar[j]);
            }
            long c = insertSort(ar);
            System.out.println(c);
        }
    }


    public static long insertSort(int[] ar) {
        long count = 0;
        // Compute the required count
        return count;

    }


}
