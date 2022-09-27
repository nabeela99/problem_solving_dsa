package problem_solving;

import java.util.*;

public class PickingNumbers {
    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4,97,5,97,97,4,97,4,97,97,97,97,4,4,5,5,97,5,97,99,4,97,5,97,97,97,5,5,97,4,5 ,97,97,5,97,4,97,5,4,4,97,5,5,5,4 ,97,97,4,97,5,4,4,97,97,97,5,5,97,4,97,97,5,4,97,97,4,97,97,97,5,4,4,97,4,4,97,5,97,97,97,97,4 ,97,5,97,5,4,97,4,5,97,97,5,97,5,97,5,97,97,97)));
    }

    public static int pickingNumbers(List<Integer> a) {
        int result = 0;
        Collections.sort(a);
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0 ; i < a.size() ; i++){
            map.put(a.get(i), map.getOrDefault(a.get(i), 0)+1);
        }
        int temp = 0;
        int sum = 0;
        for (Map.Entry <Integer,Integer> val : map.entrySet()){
            if (map.containsKey(val.getKey() - 1)){
                sum = val.getValue() + temp;
                if (sum > result){
                    result = sum;
                }
            }
            temp = val.getValue();
        }
        for (Integer key : map.keySet()){
            if (map.get(key) > result){
                result = map.get(key);
            }
        }
        return result;
    }
}
