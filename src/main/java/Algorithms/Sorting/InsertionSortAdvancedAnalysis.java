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
        for (int i = 1; i < ar.length; i++) {
            int temp = ar[i];
            for (int j = i - 1; j >= 0; j--) {
                if (ar[j] > temp) {
                    ar[j + 1] = ar[j];
                    count++;
                } else {
                    ar[j + 1] = temp;
                    break;
                }
                if (j == 0) {
                    ar[0] = temp;
                }
            }

        }
        return count;

    }


}
