package leetcode.easy;

import java.util.Scanner;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int sumLeft = nums[i];
        int sumRight = nums[j];
        int index = -1;
        while(i < nums.length-1 && j > 0){
            if (sumLeft < sumRight){
                i++;
                sumLeft += nums[i];
            }else if (sumLeft > sumRight){
                j--;
                sumRight += nums[j];
            }else if (sumLeft == sumRight && (i+1) == (j-1)){
                break;
            }else {
                i++;
                j--;
            }
        }
        if (i == 0 && sumRight == 0 || j == 0 && sumLeft == 0){
            index = 0;
        }else if ((i+1) == (j-1)){
            index = i + 1;
        }else{
            index = -1;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        FindPivotIndex p1 = new FindPivotIndex();
        System.out.println(p1.pivotIndex(arr));
    }
}
