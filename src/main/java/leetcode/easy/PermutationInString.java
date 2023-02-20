package leetcode.easy;

import java.util.List;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        int length = s1.length();
        int i = 0;
        int j = length;
        while (j <= s2.length()){
            int count = 0;
            String temp = s2.substring(i,j);
            if (checkString(s1,temp)){
                return true;
            }else{
                i++;
                j++;
            }
        }
        return false;
    }
    public static boolean checkString(String s1,String s){
        int [] arr = new int [26];
        int [] arr1 = new int [26];
        for (char c : s1.toCharArray()){
            arr[c-'a']++;
        }
        for (char d : s.toCharArray()){
            arr1[d-'a']++;
        }
        for (int i = 0 ; i < 26 ; i++){
            if (arr[i] != arr1[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
}
