package leetcode.hard;

import java.util.ArrayList;
import java.util.List;

public class LongestPathWithDifferentCharacters {
    public static int longestPath(int[] parent, String s) {
        List <List<Integer>> l1 = new ArrayList<>();
        List <Integer> list;
        int temp = 0;
        for (int i = 0 ; i < parent.length ; i++){
            list = new ArrayList<>();
            for (int j = temp+1 ; j < parent.length ; j++){
                if (parent[j] == i){
                    list.add(j);
                }
            }
            if (list.size()> 0){
                temp = list.get(list.size()-1);
                l1.add(list);
            }
        }
        for (int i = 0 ; i < l1.size() ; i++){
            System.out.print(l1.get(i));
        }
        int res = pathSearch(s,l1,0);
        return res;
    }
    static int pathSearch(String s, List<List<Integer>> l, int i){
        int max = 0;
        if (i >= l.size()){
            return 1;
        }
        char ch = s.charAt(i);
        int k = 0;
        for (int j = 0 ; j < l.get(i).size(); j++){
            if (ch == s.charAt(l.get(i).get(j))){
                continue;
            }
            else{
                k = l.get(i).get(j);
            }
            int chain = pathSearch(s,l,k);
            if (chain > max){
                max = chain;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {-1,0,0,1,1,2};
        String s = "abacbe";
        System.out.println(longestPath(arr,s));
    }
}
