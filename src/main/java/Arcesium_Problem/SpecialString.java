package Arcesium_Problem;
import java.util.*;

public class SpecialString {

    // Complete the substrCount function below.
    static int substrCount(String s) {

        char [] b = s.toCharArray();
        List<String> sps = new ArrayList<>();
        for (int i =0; i< s.length(); i++) {
            for (int j =i+1 ; j< s.length()+1; j++) {
                if (b[i] == b[j-1]) {
                    sps.add(s.substring(i, j));
                }
            }
        }
        System.out.println(sps);
        return sps.size();
//
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String s = sc.nextLine();
        sc.close();
        SpecialString.substrCount(s);

    }
}


