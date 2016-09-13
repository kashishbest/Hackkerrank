package Algorithms.Strings;

/**
 * Created by kashishsinghal on 14/09/16.
 */

import java.util.Scanner;

public class SuperReducedString {


    static String reduceString(String input) {
        char[] charStr = input.toCharArray();
        boolean found = false;
        int pos = -1;
        for (int i = 0; i <= input.length() - 2; i++) {
            if (charStr[i] == charStr[i + 1]) {
                found = true;
                pos = i;
                break;
            }
        }

        if (pos >= 0) {
            String part1 = input.substring(0, pos);
            String part2 = input.substring(pos + 2);
            String result = part1 + part2;
            return result;
        }
        return input;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String res;
        while (true) {
            res = reduceString(input);
            if (input.equals(res) || res.length() == 0) {
                break;
            }
            input = res;
        }
        //res = reduceString(input);
        if (res.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.print(res);
        }
    }
}