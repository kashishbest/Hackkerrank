package Booking;

import java.util.Scanner;

/**
 * Created by kashishsinghal on 22/09/16.
 */
public class DeltaEncoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number1 = scanner.nextLong();
        System.out.print(number1+" ");
        while (scanner.hasNext()){
            long number2 = scanner.nextLong();
            long diff = number2 - number1;
            number1 = number2;
            if(diff>127||diff<-127)
                System.out.print("-128 ");
            System.out.print(diff+" ");
        }
    }
}
