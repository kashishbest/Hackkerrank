package GoogleInterview;

import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Kashish-Mac on 26/10/16.
 */
public class SuffixArrayConstruction {
    public static void main(String args[]) {
        String str;
        Scanner sc  = new Scanner(System.in);

        str = sc.next();
        List<String> suffixList = new ArrayList();
        int length = str.length();
        for(int i = 0;i<length;i++) {
            suffixList.add(str.substring(i));
        }
        suffixList.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(int i = 0;i<length;i++) {
            System.out.println(suffixList.get(i));
        }
    }
}
