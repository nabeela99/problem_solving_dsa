package sorting;
import java.util.*;

public class ListSorting {
    public static void main(String[] args) {
        List<List<Integer>> nl = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,4);
        l2.add(0,10);
        l2.add(1,12);
        l2.add(2,15);
        l3.add(0,3);
        l3.add(1,9);
        l3.add(2,13);
        nl.add(l1);
        nl.add(l2);
        nl.add(l3);
        sort(nl);
    }

    static void sort(List<List<Integer>> nl){

        Queue<Integer> q = new PriorityQueue<>(Integer::compare);

        for (List<Integer> l : nl) {
            for (Integer i : l) {
                q.add(i);
            }
        }

        System.out.print(q);
    }

}
