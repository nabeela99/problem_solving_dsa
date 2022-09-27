package mountblue_challenge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        System.out.println(cutTheSticks(Arrays.asList(8,4,4,2,2,8)));
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> count = new ArrayList<>();
        count.add(arr.size());
        int temp;
        int des = 0;
        int [] a = new int[arr.size()];
        for (int i = 0 ; i < arr.size() ; i++){
            a[i] = arr.get(i);
        }
        while (a[0] != a[a.length-1]) {
            temp = 0;
            int min = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] == min) {
                    temp++;
                } else if (a[i] != min) {
                    a[i - temp] = a[i] - min;
                    des = i - temp + 1;
                }
            }
            a = Arrays.copyOfRange(a, 0, des);
            count.add(a.length);
        }
        return count;
    }
}
