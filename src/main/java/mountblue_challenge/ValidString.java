package mountblue_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ValidString {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = isValid(s);
        System.out.println(result);

//        System.out.println(isValid(""));

        bufferedReader.close();
    }

    public static String isValid(String s) {
        int [] charFreq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charFreq[s.charAt(i) - 'a']++;
        }
        Arrays.sort(charFreq);
        int diff = 0;
        int same = 0;
        // 1 1 2 2
        int le = 0;
        int sameValue = -1;
        for (int i = 0 ; i < charFreq.length - 1; i++) {
            if (charFreq[i] == 0) continue;
            le++;
            if (charFreq[i] != charFreq[i + 1]) {
                diff++;
                if (i + 1 != charFreq.length - 1) {
                    same = 0;
                }

            }

            if (charFreq[i] == charFreq[i + 1]) {
                sameValue = charFreq[i];
                same += 2;
            }
            if (diff > 2) return "NO";
        }
        if (le + 1 - same > 1) return "NO";
        if (diff == 1 || diff == 0) return "YES";

        return "NO";
    }
}
