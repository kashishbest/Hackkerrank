package Algorithms.Search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kashishsinghal on 22/09/16.
 */
public class Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = scanner.nextLong();
        int n = scanner.nextInt();
        int i = 0;
        int []arr = new int[n];
        while (i<n)
            arr[i++]=scanner.nextInt();
        Arrays.sort(arr);
        i = 0;
        n--;
        while (i<n){
            if(arr[i]+arr[n]>sum)
                n--;
            else if(arr[i]+arr[n]<sum)
                i++;
            else{
                System.out.println(1);
                return;
            }

        }
        System.out.println(0);
    }
}
