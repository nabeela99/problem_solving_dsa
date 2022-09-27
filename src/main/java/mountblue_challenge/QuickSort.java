package mountblue_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        System.out.println(QuickSort.quickSort(Arrays.asList(5,8,2,6,9,1,3)));
        System.out.println(QuickSort.quickSort(Arrays.asList(2,3,5,8,34,242,4)));
        System.out.println(QuickSort.quickSort(Arrays.asList(4,2,1,5,3,0,10,-1,1000)));
        System.out.println(QuickSort.quickSort(Arrays.asList(1000,5,8,2,6,9,1)));
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        List<Integer> qs = new ArrayList<>();

        int s = arr.size();
        int [] res = new int [s];
        int p = arr.get(0);
        int pivPlace = (s-1)/2;
        int right = pivPlace + 1;
        int countl = 0;
        int countm = 0;



        for (int i =0 ; i< s; i++){
            if (arr.get(i) < p){
                countl++;
                if(countl <= pivPlace) {
                    res[countl - 1] = arr.get(i);
                }else{
                    pivPlace++ ;
                    res[countl - 1] = arr.get(i);
                }

            } else if (arr.get(i) > p){
                countm++;
                if (countm <= pivPlace) {
                    res[s-countm] = arr.get(i);
                }else{
                    pivPlace-- ;

                    res[s-countm] = arr.get(i);
                }
            }
        }
        res[pivPlace] = p;
        for (int i : res) {
            qs.add(i);
        }

        return qs;

    }
}
