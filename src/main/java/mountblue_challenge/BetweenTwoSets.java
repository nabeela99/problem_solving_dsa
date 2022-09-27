package mountblue_challenge;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        System.out.println(BetweenTwoSets.getTotalX(Arrays.asList(2,4), Arrays.asList(16,32,96)));
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int sa = a.size();
        int sb = b.size();
        int f1 = a.get(sa-1);
        int f2 = b.get(0);
        int count = 0;
        int temp1;
        int temp2;

        for (int j = f1; j <= f2 ; j++) {
            temp1 = 0;
            for (Integer i : a) {
                if (j % i == 0) {
                    temp1++;
                }
            }
            if (temp1 == sa) {
                temp2 = 0;
                for (Integer k : b) {
                    if (k % j == 0) {
                        temp2++;
                    }
                }
                if (temp2 == sb){
                    count++;
                }
            }
        }
      return count;
    }

}
