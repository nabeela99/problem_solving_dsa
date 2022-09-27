package problem_solving;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintOrder {
    public static void main(String[] args) {
        String s = "abcdeeedddffsss";
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
//            counts.put(c, counts.getOrDefault(c, 0) + 1);
            if(counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> values : counts.entrySet()) {
            System.out.print(values.getValue()+""+values.getKey());
        }

    }
}
