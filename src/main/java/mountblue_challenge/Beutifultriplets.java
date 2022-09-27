package mountblue_challenge;

import java.util.*;

public class Beutifultriplets {
    public static void main(String[] args) {
        int d = 3;
        List<Integer> arr = Arrays.asList(1,6,7,7,8,10,12,13,14,19);
        System.out.println(beautifulTriplets(d, arr));
    }
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr.size() ; i++){
            for (int j = i+1 ; j < arr.size() ; j++){
                if (arr.get(j) - arr.get(i) == d){
                    map.put(arr.get(i) , map.getOrDefault(arr.get(i),0)+1);
                    map.put(arr.get(j) , map.getOrDefault(arr.get(j),0)+1);
                }
            }
        }
        for (Map.Entry<Integer,Integer> val : map.entrySet()){
            if (val.getValue() >= 2){
                count++;
            }
        }
        return count;
    }
}
