package mountblue_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class GamingArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5,2,6,3,4);
        System.out.println(gamingArray(arr));
    }
//    public static String gamingArray(List<Integer> arr) {
//        int lHighestIndex = 0;
//        int rHighestIndex = 0;
//        int high = 0;
//        boolean lTurn = true;
//        boolean rTurn = false;
//        int i = 0;
//        int lEnd = arr.size() - 1;
//        while(true) {
//            if (lTurn) {
//                if (arr.get(i) > high) {
//                    high = arr.get(i);
//                    lHighestIndex = i;
//                }
//                if (i == lEnd) {
//                    lTurn = false;
//                    rTurn = true;
//                    high = 0;
//                    lHighestIndex = lHighestIndex - 1;
//                    i = 0;
//                    if (lHighestIndex < 0) break;
//                } else {
//                    i++;
//                }
//            }
//            if (rTurn) {
//                if(arr.get(lHighestIndex) > high) {
//                    high = arr.get(lHighestIndex);
//                    rHighestIndex = lHighestIndex;
//                }
//
//                if (lHighestIndex == 0) {
//                    lTurn = true;
//                    rTurn = false;
//                    high = 0;
//                    lEnd = rHighestIndex - 1;
//                    if (lEnd < 0) break;
//                } else {
//                    lHighestIndex--;
//                }
//
//            }
//        }
//        if (lEnd == -1) return "ANDY";
//        return "BOB";
//    }


    public static String gamingArray(List<Integer> arr) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for (Integer i : arr) {
            st.push(i);
        }
        while (!st.isEmpty()) {
            int max = Collections.max(st);
            while (st.peek() != max) {
                st.pop();
            }
            count++;
            st.pop();
        }
        if (count % 2 == 0) {
            return "ANDY";
        }else
            return "BOB";
    }

}
