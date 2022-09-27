package mountblue_challenge;

import java.util.*;

public class Sherlock {
    public static void main(String[] args) {
        String s = "aaabbcc";
        System.out.println(isValid(s));
    }
    public static String isValid(String s) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Integer,Integer> temp = new HashMap<>();
        List<Integer> st = new ArrayList<>();
        List<Integer> st1 = new ArrayList<>();
        char [] c = s.toCharArray();
        for (char i : c){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Character,Integer> val : map.entrySet()){
            temp.put(val.getValue(),temp.getOrDefault(val.getValue(),0)+1);
        }
        if (temp.size()==1){
            return "YES";
        }else if (temp.size() > 2){
            return "NO";
        }else {
            for (Map.Entry<Integer, Integer> val1 : temp.entrySet()) {
                st.add(val1.getKey());
                st1.add(val1.getValue());
            }
        }
        if ((st.get(0) == 1 && st1.get(0) ==1)|| (st.get(1) == 1 && st1.get(1) ==1 )){
                return "YES";
        }else if ((Math.abs(st.get(1) - st.get(0))== 1)) {
            if (st.get(0) > st.get(1) && st1.get(0) == 1){
                return "YES";
            }else if (st.get(1) > st.get(0) && st1.get(1) == 1){
                return "YES";
            }else {
                return "NO";
            }
        }else
            return "NO";
    }

}
