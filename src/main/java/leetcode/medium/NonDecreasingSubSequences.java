package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubSequences {
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        helper(nums, 0, Integer.MIN_VALUE, new ArrayList<Integer>());
        List ans = new ArrayList(set);
        return ans;
    }
    public void helper(int[] nums, int idx, int min, ArrayList<Integer> path) {
        if (path.size() >= 2) {
            set.add(new ArrayList(path));
        }

        for (int i = idx; i < nums.length; ++i) {
            if (nums[i] >= min) {
                path.add(nums[i]);
                helper(nums, i + 1, nums[i], path);
                path.remove(path.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        int [] num = {4,6,7,7};
        NonDecreasingSubSequences n1 = new NonDecreasingSubSequences();
        System.out.println(n1.findSubsequences(num));
    }
}
