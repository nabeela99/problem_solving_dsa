package mountblue_challenge;

import java.io.*;
import java.util.stream.IntStream;

public class LoveLetter {
    public static void main(String[] args){
        String s = "abcd";
        System.out.println(theLoveLetterMystery(s));
    }
    public static int theLoveLetterMystery(String s) {
        int size = s.length();
        int count = 0;
        int mid = (size + 1)/2;
        for (int i = 0 ; i < mid ; i++){
            if (s.charAt(i) - 'a' > s.charAt(size - 1 - i) - 'a'){
                count += (s.charAt(i) - 'a') - (s.charAt(size - 1 - i) - 'a');
            }else if (s.charAt(i) - 'a' < s.charAt(size - 1 - i)){
                count += (s.charAt(size - 1 - i) - 'a') - (s.charAt(i) - 'a');
            }

        }
        return count;
    }
}
