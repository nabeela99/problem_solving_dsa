package mountblue_challenge;

import java.util.*;
import java.util.stream.Stream;

public class MissingNumbers {

    public static void main(String[] args) {
        String raw = "11 4 11 7 13 4 12 11 10 14";
        String raw1 = "11 4 11 7 3 7 10 13 4 8 12 11 10 14 12";
        List<Integer> sub = Stream.of(raw.split(" "))
                .map(Integer::parseInt).toList();
        List<Integer> og = Stream.of(raw1.split(" "))
                .map(Integer::parseInt).toList();

        System.out.println(missingNumbers(sub, og));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> og = new HashMap<>();
        Map<Integer, Integer> sub = new HashMap<>();

        for (Integer i : brr) {
            og.put(i, og.getOrDefault(i, 0) + 1);
        }

        for (Integer i : arr) {
            sub.put(i, sub.getOrDefault(i, 0) + 1);
        }

        for (Integer i : og.keySet()) {
            if (!sub.containsKey(i) || !sub.get(i).equals(og.get(i))) {
                res.add(i);
            }
        }
        return res;
    }



}
