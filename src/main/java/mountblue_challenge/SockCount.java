package mountblue_challenge;
import java.util.*;

//3 4 21 36 10 28 35 5 24 42
//10 5 20 20 4 5 2 25 1
public class SockCount {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(1,2,3,4,5,6,7,8,6,4,53,535,35,353,5,3,35);
        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        printLeastAndMax(scores);

      //  new SockCount().printLeastAndMax(scores);

    }

    public static void printLeastAndMax (List<Integer> scores) {
        int min = scores.get(0),minCount = 0,high = scores.get(0),highCount = 0;
        for (Integer i : scores) {
            if (i < min) {
                minCount++;
                min = i;
            }
            if (i > high) {
                highCount++;
                high = i;
            }

        }
        System.out.println("Lowest scores : "+minCount + ", Highest : " + highCount);
    }
}

