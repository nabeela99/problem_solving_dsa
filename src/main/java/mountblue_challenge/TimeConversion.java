package mountblue_challenge;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.*;

public class TimeConversion {

    public static String timeConversion(String input) {
        Map<Long, String> ampmStrings = Map.of(0L, "AM", 1L, "PM");
        DateTimeFormatter timeFormatter = new DateTimeFormatterBuilder()
                .appendPattern("hh:mm:ss")
                .appendText(ChronoField.AMPM_OF_DAY, ampmStrings)
                .toFormatter();
        LocalTime t = LocalTime.parse(input, timeFormatter);
        return t.format(DateTimeFormatter.ISO_TIME);
    }


    public static void main(String[] args) {

    }

    public static String happyLadybugs(String b) {
        String r = null;
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put(b.charAt(0), 1);
        boolean needAdjust = false;
        for (int j = 1; j < b.length(); j++) {
            char ch = b.charAt(j);
            if (hmap.containsKey(ch)) {

                if ((j == b.length() - 1 && b.charAt(j) != b.charAt(j - 1))
                        || b.charAt(j) != b.charAt(j - 1) && ((b.charAt(j) != b.charAt(j + 1)))) {
                    needAdjust = true;
                }
                hmap.put(ch, hmap.get(ch) + 1);
            } else {
                hmap.put(ch, 1);
            }

        }
        boolean found = false;
        Set<Map.Entry<Character, Integer>> s = hmap.entrySet();
        for (Map.Entry<Character, Integer> entry : s) {
            int value = entry.getValue();
            char key = entry.getKey();
            if (value == 1 && key != '_') {
                r = ("NO");
                found = true;
                break;
            } else if (needAdjust && !hmap.containsKey('_')) {
                r = ("NO");
                found = true;
                break;
            }
        }
        if (!found)
            r = ("YES");
        hmap.clear();
        return r;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> finalScores = new ArrayList<>(ranked);

        List<Integer> r = new ArrayList<>();

        for (Integer aliceScore : player) {
            finalScores.add(aliceScore);
            finalScores.sort(Collections.reverseOrder());
            Set<Integer> set = new LinkedHashSet<>(finalScores);
            finalScores.clear();
            finalScores.addAll(set);
            r.add(finalScores.indexOf(aliceScore) + 1);
        }
        return r;
    }


    private static List<Integer> getAliceScores(Scanner scanner) {
        return getIntegers(scanner);
    }

    private static List<Integer> getPlayerScores(Scanner scanner) {
        return getIntegers(scanner);
    }


    private static List<Integer> getIntegers(Scanner scanner) {
        int size = scanner.nextInt();
        List<Integer> integers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            integers.add(scanner.nextInt());
        }
        return integers;
    }

}
