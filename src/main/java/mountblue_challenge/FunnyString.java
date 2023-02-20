package mountblue_challenge;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {
    public static void main(String[] args) {
        String s;
        System.out.println(funnyString("acxz"));
    }
    public static String funnyString(String s) {
        int [] arr= new int [s.length()];
        int [] arrRev= new int [s.length()];
        List<Integer> arrL = new ArrayList<>();
        List<Integer> arrRevL = new ArrayList<>();
        for (int i = 0 ; i < s.length(); i++){
            arr[i] = s.charAt(i) - 'a';
            arrRev[i] = s.charAt(s.length()-1-i) - 'a';
        }

        for (int i = 0 ; i < s.length()-1; i++){
            arrL.add(Math.abs(arr[i+1] - arr[i])) ;
            arrRevL.add(Math.abs(arrRev[i+1] - arrRev[i])) ;
        }
        if (arrL.equals(arrRevL)){
            return "Funny";
        }else
            return "Not Funny";
    }
//    int start = 0;
//    int end = s.length()-1;
//        while (start < s.length()-1 && end > 1){
//        int difF = Math.abs((s.charAt(start)-'a') - (s.charAt(start+1)-'a'));
//        int difR = Math.abs((s.charAt(end)-'a') - (s.charAt(end-1)-'a'));
//        if (difF != difR){
//            return "Not Funny";
//        }
//        start++;
//        end--;
//    }
//        return "Funny";

}
