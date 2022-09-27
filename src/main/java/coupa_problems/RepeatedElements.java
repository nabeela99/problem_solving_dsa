package coupa_problems;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class RepeatedElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] subArr = Arrays.copyOfRange(a, L, R + 1);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < subArr.length; i++) {
            map.put(subArr[i], map.getOrDefault(i, 0) + 1);
        }
        int count =0;
        for (Map.Entry<Integer,Integer> values : map.entrySet()){
            if (values.getKey()>0){
                count++;
            }
        }
        System.out.println(count);
    }

}
