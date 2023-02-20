package leetcode.weeklycontest;

import java.time.LocalTime;

public class Contest316 {
    public static void main(String[] args) {
        String[] event1 = {"14:13","22:08"};
        String[] event2 = {"02:40","08:08"};
        System.out.println(new Contest316().haveConflict(event1, event2));
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        LocalTime e1s = LocalTime.parse(event1[0]);
        LocalTime e1e = LocalTime.parse(event1[1]);
        LocalTime e2s = LocalTime.parse(event2[0]);
        LocalTime e2e = LocalTime.parse(event2[1]);

        return (isAfterOrEquals(e1s, e2s) && isBeforeOrEquals(e1e, e2e))
                ||
                (isAfterOrEquals(e1e, e2s) && isBeforeOrEquals(e1e, e2e))
                ||
                (isAfterOrEquals(e2s, e1s) && isBeforeOrEquals(e2s, e1e))
                ||
                (isAfterOrEquals(e2e, e1s) && isBeforeOrEquals(e2e, e1e))
                ;

    }

    boolean isBeforeOrEquals(LocalTime l1, LocalTime l2) {
        return l1.isBefore(l2) || l1.equals(l2);
    }

    boolean isAfterOrEquals(LocalTime l1, LocalTime l2) {
        return l1.isAfter(l2) || l1.equals(l2);
    }
}
