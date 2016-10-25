package Algorithms.Sorting;

/**
 * Created by kashishsinghal on 14/09/16.
 * https://www.hackerrank.com/challenges/tutorial-intro
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TutorialChallenge {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int size = sc.nextInt();
        List<Integer> array = new ArrayList();
        while (size-- > 0) {
            array.add(sc.nextInt());
        }
        System.out.print(array.indexOf(value));
    }
}