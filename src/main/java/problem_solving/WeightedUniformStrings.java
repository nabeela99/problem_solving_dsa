package problem_solving;

import java.util.ArrayList;
import java.util.List;

public class WeightedUniformStrings {
    public static List<String> uniformStrings(String s, List<Integer> queries) {
        List<String> list = new ArrayList<>();
        int count = 1;
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (sb.toString().equals(c + "")){
                count++;
                index = queries.indexOf((c - 'a' + 1) * count);
                if (index >= 0){
                    list.add(index,"Yes");
                }
            }else{
                sb = new StringBuilder();
                index = queries.indexOf(c - 'a' + 1);
                if (index >= 0){
                    list.add(index,"Yes");
                }
                sb.append(c);
                count = 1;
            }
        }
        for(int i = 0 ; i < queries.size(); i++) {
            if (list.get(i) != "Yes") {
                list.add("No");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "aaabbbbcccddd";
        List<Integer> l = List.of(9,7,8,12,5);
        System.out.println(WeightedUniformStrings.uniformStrings(s,l));
    }
}
