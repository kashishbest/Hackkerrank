package Algorithms.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kashishsinghal on 14/09/16.
 */
public class SherlockAndArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            List<Integer> ar = new ArrayList<Integer>();
            int sum = 0;
            for(int i = 0;i<n;i++) {
                ar.add(sc.nextInt());
                sum+=ar.get(i);
            }

            int left,right;
            left = 0;
            right = sum;
            boolean found = false;
            for (int i =0;i<n;i++) {
                right = right - ar.get(i);
                if (left == right) {
                    System.out.println("YES");
                    found = true;
                    break;
                }
                left = left+ar.get(i);
            }
            if(!found) {
                System.out.println("NO");
            }
        }
    }
}
