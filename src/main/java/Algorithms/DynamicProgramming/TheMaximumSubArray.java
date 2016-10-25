package Algorithms.DynamicProgramming;

/**
 * Created by kashishsinghal on 14/09/16.
 * Problem Link : https://www.hackerrank.com/challenges/maxsubarray
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheMaximumSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int size = sc.nextInt();
            List<Integer> array = new ArrayList();
            List<Integer> array2 = new ArrayList();
            for (int i = 0; i < size; i++) {
                int item = sc.nextInt();
                array.add(item);
                array2.add(item);
            }

            int maxUptoHere = array.get(0);
            int globalMax = array.get(0);
            array.remove(0);
            for (int elem : array) {
                maxUptoHere = Math.max(elem, maxUptoHere + elem);
                globalMax = Math.max(maxUptoHere, globalMax);
            }
            System.out.print(globalMax + " ");
            maxUptoHere = array2.get(0);
            array2.remove(0);
            for (int elem : array) {
                if (maxUptoHere + elem > elem) {
                    maxUptoHere = Math.max(maxUptoHere, maxUptoHere + elem);
                } else {
                    maxUptoHere = Math.max(elem, maxUptoHere);
                }

//                globalMax = Math.max(maxUptoHere,globalMax);
            }
            System.out.println(maxUptoHere);


        }
    }
}