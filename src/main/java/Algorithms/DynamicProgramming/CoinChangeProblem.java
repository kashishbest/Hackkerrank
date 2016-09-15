package Algorithms.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kashishsinghal on 14/09/16.
 * https://www.hackerrank.com/challenges/coin-change
 */
public class CoinChangeProblem {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        List<Integer> denom = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            denom.add(sc.nextInt());
        }
        System.out.println(getChangeCount(n, m, denom));
    }

    static Long getChangeCount(int n, int m, List<Integer> denom) {
        Long[][] table = new Long[n + 1][m];
        for (int i = 0; i < m; i++) {
            table[0][i] = Long. valueOf(1);
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < m; j++) {
                Long x = Long.valueOf((i - denom.get(j)) >= 0 ? table[i - denom.get(j)][j] : 0);
                Long y = Long.valueOf(j >= 1 ? table[i][j - 1] : 0);

                table[i][j] = x+y;
            }
        }

        return table[n][m-1];
    }
}
