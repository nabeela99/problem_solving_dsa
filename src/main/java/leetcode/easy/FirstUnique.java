package leetcode.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique {

    public static void main(String[] args) {
        System.out.println(new FirstUnique().firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {
        int res = -1;
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        char c = 'A';
        for (Map.Entry<Character,Integer> val : map.entrySet()){
            if (val.getValue() == 1){
                c = val.getKey();
                break;
            }
        }
        System.out.println("Index of : " + c);
        res = s.indexOf(c);

        return res;

    }
}
