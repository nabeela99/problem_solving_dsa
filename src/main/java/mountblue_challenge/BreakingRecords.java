package mountblue_challenge;

import java.util.*;

public class BreakingRecords {

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
        breakingRecords(scores);
    }

    public static void breakingRecords(List<Integer> scores) {
        int st = scores.get(0);
        int n = scores.size();
        List<Integer> temph = new ArrayList();
        List<Integer> templ = new ArrayList();
        Set<Integer> hs = new HashSet<>();
        Set<Integer> ls = new HashSet<>();
        List<Integer> nl = new ArrayList();
        int mincount = 0;
        int maxcount = 0;

        for (int i =1 ; i < scores.size(); i++){
            temph = scores.subList(0,i+1);
            Collections.sort(temph);
            if(temph.get(i) != st){
                hs.add(temph.get(i));
            }
        }
        System.out.println(hs);

        for (int i =1 ; i < scores.size(); i++){
            templ = scores.subList(0,i+1);
            Collections.sort(templ);
            if(templ.get(0) != st) {
                ls.add(templ.get(0));
            }
        }
        System.out.println(ls);
        hs.add(scores.get(n-1));
        maxcount = hs.size();
        ls.add(scores.get(0));

        mincount = ls.size();
        nl.add(0,maxcount);
        nl.add(1,mincount);
        System.out.println(nl);
    }
}
