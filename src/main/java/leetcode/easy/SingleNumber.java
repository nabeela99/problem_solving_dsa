package leetcode.easy;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int k = 0;
        for (int i : nums){
            k = k ^ i;
        }
        return k;
    }

    public static void main(String[] args) {
        int [] arr = {2,2,1,3,5,1,3};
        System.out.println(singleNumber(arr));
    }
}
