package problem_solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 5
 * 5 41 77 74 22 44
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 */

public class ArrayQueries {
    public static void main(String[] args) {
        List<List<Integer>> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numberOfArrays = Integer.parseInt(sc.nextLine());
        while(numberOfArrays > 0 ) {
            List<Integer> e = new ArrayList<>();
            String line = sc.nextLine();
            String[] elements = line.split(" ");
            int numberOfElements = Integer.parseInt(elements[0]);
            for (int i = 1 ; i <= numberOfElements; i++) {
                e.add(Integer.parseInt(elements[i]));
            }
            al.add(e);
            numberOfArrays--;
        }

        List<String> queries = new ArrayList<>();
        int numOfQ = Integer.parseInt(sc.nextLine());
        while(numOfQ > 0) {
            queries.add(sc.nextLine());
            numOfQ--;
        }

        for(String q : queries) {
            String[] q1 = q.split(" ");
            if (al.size() > Integer.parseInt(q1[0]) - 1) {
                List<Integer> l = al.get(Integer.parseInt(q1[0]) - 1);
                if(l.size() > Integer.parseInt(q1[1]) - 1) {
                    System.out.println(l.get(Integer.parseInt(q1[1]) - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
