package Booking;

import java.util.*;

/**
 * Created by kashishsinghal on 22/09/16.
 */
public class HotelId {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String targetWords = scanner.nextLine();
        targetWords = targetWords.toLowerCase();
        String[] pattern = targetWords.split(" ");
        Set<String> set = new HashSet<String>(Arrays.asList(pattern));
        int n = Integer.parseInt(scanner.nextLine());
        Map<Integer, Map<String, Integer>> map = new HashMap();
        Map<Integer, Integer> countMap = new HashMap();
        while (n-- > 0) {
            int id = Integer.parseInt(scanner.nextLine());
            String line = scanner.nextLine();
            line = line.replaceAll("[^\\w\\s]","");
            line = line.toLowerCase();
            String rev[] = line.split(" ");
            for (String s : rev) {
                if (set.contains(s)) {
                    Map<String, Integer> temp = map.get(id);
                    if (temp == null)
                        temp = new HashMap();
                    Integer count = temp.get(s);
                    if (count == null)
                        count = 0;
                    temp.put(s, ++count);
                    map.put(id, temp);
                    Integer totalCount = countMap.get(id);
                    if (totalCount == null)
                        totalCount = 0;
                    countMap.put(id, totalCount + count);
                }

            }

        }
        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<Map.Entry<Integer, Integer>>(countMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> entry : list)
            System.out.print(entry.getKey() + " ");
    }
}
