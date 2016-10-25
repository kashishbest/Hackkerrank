package Booking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kashishsinghal on 22/09/16.
 */
public class Polygons {
    public static void main(String[] args) {
        int squares = 0;
        int reactangles = 0;
        int polygons = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String str;
        try {
            while ((str = br.readLine()) != "") {
                if (str == null) {
                    break;
                }


                String[] line = str.split(" ");
                int side1 = Integer.parseInt(line[0].trim());
                int side2 = Integer.parseInt(line[1].trim());
                int side3 = Integer.parseInt(line[2].trim());
                int side4 = Integer.parseInt(line[3].trim());
                if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side4 <= 0) {
                    polygons++;
                } else if (side1 == side2 && side2 == side3 && side3 == side4) {
                    squares++;
                } else if (side1 == side3 && side2 == side4)
                    reactangles++;
                else {
                    polygons++;
                }
            }

            System.out.println(squares + " " + reactangles + " " + polygons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
