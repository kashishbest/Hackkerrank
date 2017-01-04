package LendingKart;

import java.util.*;

/**
 * Created by Kashish-Mac on 04/01/17.
 */
public class SmallestWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
        String inputString = "ayxxcxxxxxxxxbxxxcxby";
        inputString = inputString.toLowerCase();
//        String str = scanner.nextLine();
        String str = "a b c";
        str = str.toLowerCase();
        String[] chars = str.split(" ");

        Map<String,Integer> countMap = new HashMap<String, Integer>();

        int count = chars.length;
        for(String c : chars) {
            if(countMap.get(c) == null) {
                countMap.put(c,1);

            }else {
                countMap.put(c,countMap.get(c)+1);
            }
        }

        int i;
        int startIndex = -1;
        for ( i =0;i<inputString.length();i++) {
            String s = inputString.substring(i,i+1);
            if(countMap.get(s) != null) {
                if(startIndex  == -1) {
                    startIndex=i;
                }
                int v = countMap.get(s);
                if(v>0) {
                    count--;
                    countMap.put(s,v-1);
                }
            }
            if(count == 0) {
                break;
            }
        }


        String soln = inputString.substring(startIndex,i+1);
        String tempString = soln;
        int minlen = soln.length();

        for(int j=i+1;j<inputString.length();j++) {
            tempString = tempString + inputString.substring(j,j+1);
            if(countMap.get(inputString.substring(j,j+1)) != null) {
                countMap.put(inputString.substring(j,j+1),countMap.get(inputString.substring(j,j+1))+1);
            }

            if(tempString.charAt(0) == tempString.charAt(tempString.length()-1)) {
                int indexToRemove = 0;
                for(int k=1;k<tempString.length();k++) {
                    if(countMap.get(tempString.substring(k,k+1)) ==  null) {
                        indexToRemove++;
                    } else if(countMap.get(tempString.substring(k,k+1)) >0 ) {
                        countMap.put(tempString.substring(k,k+1),countMap.get(tempString.substring(k,k+1))-1);
                        indexToRemove++;
                    } else {
                        break;
                    }
                }
                tempString = tempString.substring(indexToRemove+1);

            }
            if(tempString!= null && minlen > tempString.length()) {
                soln = tempString;
                minlen = tempString.length();
            }
        }
        System.out.print(soln);

    }
}
