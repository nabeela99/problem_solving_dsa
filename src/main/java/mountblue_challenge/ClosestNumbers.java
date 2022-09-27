package mountblue_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854);
        System.out.println(closestNumbers(arr));
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        Collections.sort(arr);
        int d = arr.get(0);
        int min = arr.get(arr.size() - 1);
        for (int i = 0; i < arr.size() - 1; i++) {
            d = arr.get(i + 1) - arr.get(i);
            if (d < min) {
                min = d;
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) == min) {
                list.add(arr.get(i));
                list.add(arr.get(i + 1));
            }
        }
        return list;
    }


}
