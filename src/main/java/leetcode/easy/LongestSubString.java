package leetcode.easy;

import java.util.*;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int count = 0;
        int i = 0;
        int res = 0;
        int j = 1;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        while (i < s.length() && j <= s.length()){
            String temp = s.substring(i,j);
            if (!set.add(s.charAt(j-1)-'a')){
                i++;
                j = i;
                list.add(count);
                count = 0;
                set = new HashSet<>();
            }else{
                count++;
            }
            j++;
        }
        list.add(count);
        Collections.sort(list);
        res = list.get(list.size()-1);
        return res;
    }

    public static void main(String[] args) {
        LongestSubString s1 = new LongestSubString();
        System.out.println(s1.lengthOfLongestSubstring("aab"));
    }
}
