package mountblue_challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PriyankaAndToys {
    public static void main(String[] args) {
        System.out.println(toys(Arrays.asList(1,2,3,21,7,12,14,21)));
    }
    public static int toys(List<Integer> w) {
        Collections.sort(w);
        int count = 1;
        while (w.get(w.size()-1) - w.get(0) > 4){
            for (int i = 0 ; i < w.size() ;i++){
                int min = w.get(0);
                if (w.get(i) - min > 4) {
                    w = w.subList(i, w.size());
                    count++;
                    break;
                }
            }

        }
        return count;
    }
}
