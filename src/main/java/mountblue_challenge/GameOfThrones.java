package mountblue_challenge;

import java.util.*;

public class GameOfThrones {
    public static void main(String[] args) {
        String s = "";
        System.out.println(gameOfThrones("cdefghmnopqrstuvw"));
    }
    public static String gameOfThrones(String s) {
        Map<Character,Integer> pal = new HashMap<>();
        List<Integer> palV = new ArrayList<>();
        int temp = 0;
        for (char c : s.toCharArray()){
            pal.put(c, pal.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> val : pal.entrySet()){
            palV.add(val.getValue());
        }
        Collections.sort(palV);
        
        return "NO";
    }
}
