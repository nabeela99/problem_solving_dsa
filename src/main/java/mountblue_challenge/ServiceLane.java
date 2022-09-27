package mountblue_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ServiceLane {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> cases = new ArrayList<>();
        cases.add(Arrays.asList(1,3));
        List<Integer> width  = Arrays.asList(1,2,2,2,1);
        System.out.println(serviceLane(n, cases , width));

    }
    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int min = 0;
        for (int i = 0 ; i < cases.size() ; i++){
            int entry = cases.get(i).get(0);
            int exit = cases.get(i).get(1);
            temp = width.subList(entry , exit+1);
            Collections.sort(temp);
            min = temp.get(0);
            list.add(min);
        }
        return list;
    }
}
