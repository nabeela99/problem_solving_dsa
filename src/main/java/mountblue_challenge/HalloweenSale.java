package mountblue_challenge;

import java.util.ArrayList;
import java.util.List;

public class HalloweenSale {
    public static void main(String[] args) {
        int p = 20;
        int d = 3;
        int m = 6;
        int s = 80;
        System.out.println( howManyGames(p,d,m,s));
    }
    public static int howManyGames(int p, int d, int m, int s) {
        int sum = 0;
        int count = -1;
        List<Integer> list = new ArrayList<>();
        List<Integer> listSum = new ArrayList<>();
        while (p > m){
            list.add(p);
            p = p - d ;
        }
        System.out.println(list);
        for (Integer i : list){
            if (sum <= s){
                sum += i;
                listSum.add(sum);
            }
        }
        while (sum <= s) {
            sum += m;
            count++;
        }
        System.out.println(listSum.size() + count);

//        while (sum <= s){
//            sum += m;
//            listSum.add(sum);
//        }
//        int sizeList = listSum.size();
        return 0;
    }
}
