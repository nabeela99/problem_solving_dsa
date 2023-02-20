package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationBacktrack {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper_backtrack(n, k, 1, new ArrayList<>(), res);
        return res;
    }

    public static void helper_backtrack(int n, int k, int begin,
                                 List<Integer> list, List<List<Integer>> res) {
        if (k == 0) {
            res.add(new ArrayList(list));
            return;
        }

        for (int i = begin; i <= n - k + 1; i++) {
            list.add(i);
            helper_backtrack(n, k - 1, i + 1, list, res);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
