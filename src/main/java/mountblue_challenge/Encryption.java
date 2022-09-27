package mountblue_challenge;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Encryption {
    public static void main(String[] args) {
        String s = "chillout";
        System.out.println(encryption(s));
    }
    public static String encryption(String s) {
        String st = s.replace(" ", "");
        int length = st.length();
        double val = Math.sqrt(length);
        int col = (int) Math.ceil(val);
        int row = (int) Math.floor(val);
        int count = 0;
        while (row * col < length){
            row = row + 1;
            count++;
        }
        int i = 0;
        int j = 0;
        String sb = "";
        String res = "";
        List<List<Character>> arr = new ArrayList<>();
        List<String> resl = new ArrayList<>();
        char [] c = new char[row];
        while (i < st.length()) {
            if ((col + i) <= length) {
                sb = st.substring(i, col + i);
                arr.add(Stream.of(sb.toString()).map(s1 -> s1.charAt(0)).collect(Collectors.toList()));
            }else {
                sb = st.substring(i, length);
                arr.add(Stream.of(sb.toString()).map(s1 -> s1.charAt(0)).collect(Collectors.toList()));
                }
            i = i+col;
        }
        System.out.println(arr);
//        int k = 0;
//        while (k < col){
//            for (j = 0 ; j < row ; j++){
//                c[j] = arr.get(j).charAt(k);
//            }
//            for (j = 0 ; j < c.length ; j++){
//                res += c[j] + "";
//            }
//            res = res + " ";
//            k++;
//        }
        return res;
    }
}
