package Arcesium_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GamingArray {
    public static void main(String[] args) {
        System.out.println(gamingArray(Arrays.asList(5,2,6,3,4)));
    }
    public static String gamingArray(List<Integer> arr) {
        String ans = "ANDY";
        int currentMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > currentMax) {
                ans = ans.equals("ANDY") ? "BOB" : "ANDY";
                currentMax = i;
            }
        }
        return ans;

    }

}
