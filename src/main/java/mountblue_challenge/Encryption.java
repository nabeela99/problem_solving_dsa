package mountblue_challenge;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Encryption {
    public static void main(String[] args) {
        String s = "feedthedog";
        System.out.println(encryption(s));
    }
    public static String encryption(String s) {
        double rt = Math.sqrt(s.length());
        int row = (int) Math.floor(rt);
        int col = (int) Math.ceil(rt);
        int mul = row * col;
        if (mul <= s.length()){
            row = row + 1;
        }
        return collection(s,0,col,row);
    }
    static StringBuilder sb = new StringBuilder();
    public static String collection(String s,int i,int col,int row){
        if (i == col){
            return sb.toString();
        }
        int j = i;
        while (j < s.length()){
            sb.append(s.charAt(j));
            j = j + col;
        }
        sb.append(" ");
        i = i+1;
        return collection(s,i,col,row);
    }
}
