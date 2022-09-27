package problem_solving;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateElements {
    public static void main(String[] args) {
        String s = "ahmedabad";
        char n;
        Map<Character,Integer> rep = new TreeMap<>() ;
        for (int i =0; i<s.length(); i++){
            n = s.charAt(i);
            rep.put(n,rep.getOrDefault(n,0)+1);
        }
        for (Map.Entry<Character, Integer> values : rep.entrySet()) {
            System.out.println(values.getKey()+" "+values.getValue());
        }
    }
}
