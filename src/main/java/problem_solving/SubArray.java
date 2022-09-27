package problem_solving;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public int maxSubArray(int[] nums) {
        int sum;
        int temp = Integer.MIN_VALUE;
        int [] arr = new int[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            for (int j = i+1 ; j <= nums.length ; j++){
                sum = 0;
                arr = Arrays.copyOfRange(nums , i , j);
                for (int k = 0 ; k < arr.length ; k++){
                    sum += arr[k];
                }
                if (sum > temp){
                    temp = sum;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int [] nums1 = new int[m];
        for (int i = 0 ; i < m ; i++){
            nums1[i] = sc.nextInt();
        }
        SubArray t = new SubArray();
        System.out.println(t.maxSubArray(nums1));
    }
}
