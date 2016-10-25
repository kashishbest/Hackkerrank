package GoogleInterview;

import java.util.*;

/**
 * Created by Kashish-Mac on 25/10/16.
 * <p>
 * Given a set, print the powerset of the given set
 */
public class PowerSet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> strList = Arrays.asList(str.split(","));

        int size = (int) Math.pow(2, strList.size());
        for (int i = 0; i < size; i++) {
            for(int j = 0;j<strList.size();j++) {
                if( (i & (1<<j)) > 0) {
                    System.out.print(strList.get(j));

                }
            }
            System.out.println();
        }


    }
}
