package mountblue_challenge;

import java.util.ArrayList;
import java.util.List;

public class AlternatingCharacters {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("ABABABAAB"));
    }
    public static int alternatingCharacters(String s) {
        List<String> list = new ArrayList<>();
        int count = 0;
        char [] c = s.toCharArray();
        for (int i = 0; i< c.length-1; i++){
            if (c[i] == c[i+1]){
                count++;
            }
        }
        return count;

    }
}
