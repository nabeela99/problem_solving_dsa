package problem_solving;

import java.util.Arrays;

public class RepeatedLetters {
    public static void main(String[] args) {
        String s = "this is godoasodofo aaa";
        char[] n;
        int count;
        String h = "";
        int temp = 0;
        String sp[] = s.split(" ");
        int arr[] = new int[sp.length];
        for (String spt : sp) {
            n = spt.toCharArray();
            //System.out.println(n);
            count = 1;
            for (int i = 0; i < n.length - 1; i++) {
                if (n[i] == n[i + 1]) {
                    count++;
                }
            }
            if(count > temp) {
                temp  = count;
                h = spt;
            }
        }
        System.out.println(h);
        }
    }

