package mountblue_challenge;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hackerrank {
    public static void main(String[] args) {
        String s = "rhackerank";
        System.out.println(hackerrankInString(s));
    }

    public static String hackerrankInString(String s) {
//        String st = "hackerrank";
//        int i = 0;
//        int count = 0;
//        int temp = -1;
//        for (int j = i ; j < s.length() ; j++){
//            if (s.charAt(j) == st.charAt(i) && j > temp ){
//                temp = j;
//                count++;
//                i++;
//            }
//        }
//
//        if (count ==  10) {
//            return "YES";
//        }else
//            return "NO";
        String t = "hackerrank";
        int count = 0;
        int k = 0;
        for (int i = 0; i < t.length(); i++) {
            for (int j = k; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    k = j+1;
                    count++;
                    break;
                }
            }
        }
        if (count == t.length()) {
            return "YES";
        }
        return "NO";

    }
}

//    public static String hackerrankInString1(String s) {
//
//        Map<Character, Integer> ogMap = new HashMap<>();
//        ogMap.put('h', 1);
//        ogMap.put('a', 2);
//        ogMap.put('c', 1);
//        ogMap.put('k', 2);
//        ogMap.put('e', 1);
//        ogMap.put('r', 2);
//        ogMap.put('n', 1);
//
//        Map<Character, Integer> sMap = new LinkedHashMap<>();
//        for (Character c : s.toCharArray()) {
//            sMap.put(c , sMap.getOrDefault(c, 0) + 1);
//        }
//
//
//        for (Map.Entry<Character, Integer> value : ogMap.entrySet()) {
//            if (!sMap.containsKey(value.getKey()) || sMap.get(value.getKey()) < (value.getValue())) {
//                return "NO";
//            }
//        }
//         return "YES";
//    }
//}
