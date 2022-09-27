package mountblue_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakingAnagrams {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Object z;

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = makingAnagrams(s1, s2);
        System.out.println(result);

        Integer i = 100;

        System.out.println("A" == "A");

        bufferedReader.close();
    }

    public static int makingAnagrams(String s1, String s2) {
        int [] arr1 = new int[26];
        int [] arr2 = new int[26];
        for (char c : s1.toCharArray()) {
            arr1[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            arr2[c - 'a']++;
        }

        int diff = 0;

        for (int i = 0; i < 26; i++) {
            if (arr1[i] == 0 && arr2[i] == 0) continue;

            diff += Math.abs(arr1[i] - arr2[i]);
        }

        return diff;
    }
}
