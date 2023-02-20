package problem_solving;

import java.util.ArrayList;
import java.util.List;

public class ACMICPC {
    public static List<Integer> acmTeam(List<String> topic) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        int n = topic.size();
        int k = 2;
        int max = 0;
        int countMax = 1;
        permutations(res, 1,n, k,new ArrayList<>());
        for (List<Integer> re : res) {
            String a = topic.get(re.get(0) - 1);
            String b = topic.get(re.get(1) - 1);
            int num = find(a, b);
            if (num > max) {
                max = num;
                countMax = 1;
            } else if (num == max) {
                countMax++;
            }
        }
        res1.add(max);
        res1.add(countMax);
        return res1;
    }
    public static void permutations(List<List<Integer>> res,int begin,int n ,int k,List<Integer>list){
        if (k == 0){
            res.add(new ArrayList(list));
            return;
        }
        for (int i = begin; i <= (n -k +1) ; i++){
            list.add(i);
            permutations(res, i+1, n, k-1,list);
            list.remove(list.size()-1);
        }
    }
    public static int find(String a ,String b){
        int count = 0;
        for (int i = 0 ; i < a.length() ; i++){
            if (a.charAt(i) == '1' || b.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("11101");
        l.add("10101");
        l.add("11001");
        l.add("10111");
        l.add("10000");
        l.add("01110");
        System.out.println(acmTeam(l));
    }
}
