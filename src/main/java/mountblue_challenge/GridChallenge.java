package mountblue_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("ebacd");
        grid.add("fghij");
        grid.add("olmkn");
        grid.add("trpqs");
        grid.add("xywuv");

        System.out.println(gridChallenge(grid));
    }

    public static String gridChallenge(List<String> grid) {
        List<String> sortedGrid = new ArrayList<>();
        for (String s : grid) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            sortedGrid.add(new String(chars));
        }
        char[] c = new char[grid.size()];
        int maxChars = grid.get(0).length();
        for (int i = 0; i < maxChars; i++) {
            for (int j = 0; j < grid.size(); j++) {
                c[j] = sortedGrid.get(j).charAt(i);
            }
            if (!isSorted(c)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static boolean isSorted(char[] chars) {
        char temp = 'a';
        for (int i = 0; i < chars.length - 1; i++) {
            if ((chars[i] - temp) > (chars[i + 1] - temp)) {
                return false;
            }
        }
        return true;
    }
}
