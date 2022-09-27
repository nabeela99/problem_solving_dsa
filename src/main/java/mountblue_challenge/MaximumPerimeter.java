package mountblue_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MaximumPerimeter {
    public static void main(String[] args) {

//        String raw = "1 1 1 2 3 5";
        String raw = "1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000";
        List<Integer> sub = Stream.of(raw.split(" "))
                .map(Integer::parseInt).toList();
        List<Integer> s = new ArrayList<>();
        s.addAll(sub);
        System.out.println(maximumPerimeterTriangle(s));
    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        int l = sticks.size();
        long sum = 0;
        long temp = 0;
        int i = 0;
        Collections.sort(sticks);
        List<Integer> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        while (i < l-2){
            if ((sticks.get(i) + sticks.get(i+1)) > sticks.get(i+2)){
                list = sticks.subList(i, i+3);
                sum = Long.valueOf(list.get(0)) + Long.valueOf(list.get(1)) + Long.valueOf(list.get(2));
                if (sum > temp){
                    temp = sum;
                    tempList = list;
                }else if (sum == temp){
                    if (tempList.get(2) > list.get(2)){
                        tempList = tempList;
                    }else if (tempList.get(2) < list.get(2)){
                        tempList = list;
                    }else {
                        if (tempList.get(0) >= list.get(0)){
                            tempList = tempList;
                        }else {
                            tempList = list;
                        }
                    }
                }
            }
            i = i+1;
        }if (tempList.isEmpty()){
            tempList.add(-1);
            return tempList;
        }else{
            return tempList;
        }

    }
}
