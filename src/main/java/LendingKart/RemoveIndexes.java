package LendingKart;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kashish-Mac on 04/01/17.
 */
public class RemoveIndexes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] solnArr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int[] indexArray = new int[k];
        for (int i = 0; i < k; i++) {
            indexArray[i] = scanner.nextInt();
        }

        Arrays.sort(indexArray);
        int j = 0;
        int a = 0;
        boolean found;
        for (int i = 0; i < n; i++) {
            found = false;
            while (j < k) {
                if (i > indexArray[j]) {
                    j++;
                } else if (i == indexArray[j]) {
                    found = true;
                    break;
                } else {
                    break;
                }
            }
            if (!found) {
                solnArr[a++] = arr[i];
            }
        }

        for (int i = 0; i < a; i++) {
            System.out.println(solnArr[i]);
        }
    }
}

