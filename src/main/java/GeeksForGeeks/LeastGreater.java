package GeeksForGeeks;

import java.lang.reflect.Array;
import java.util.*;

public class LeastGreater {
    public static void main(String[] args) {
        System.out.println(findLeastGreater(15, new int[] {2,6,9,1,3,2}));
    }
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int mid = (arr.length-1)/2;
        int j = mid;
        while (i < mid || j < arr.length-1){
            int num = arr[i];
            int num1 = arr[j];
            n = i+1;
            int n1 = j + 1;
            int ans = -1;
            int ans1 = -1;
            int min = Integer.MAX_VALUE;
            int min1 = Integer.MAX_VALUE;
            while (n < arr.length){
                if (arr[n] > num && arr[n] < min){
                    min = arr[n];
                    ans = min;
                }
                n++;
            }
            while (n1 < arr.length){
                if (arr[n1] > num1 && arr[n1] < min1){
                    min1 = arr[n1];
                    ans1 = min1;
                }
                n1++;
            }
            list1.add(ans);
            list2.add(ans1);
            i++;
            j++;
        }
        for (int k = 0 ; k < list2.size() ; k++){
            list1.add(list2.get(k));
        }
        list1.add(-1);
        return list1;
    }
}
