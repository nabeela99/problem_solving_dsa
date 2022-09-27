package leetcode.easy;

import java.util.*;

public class IntersectionOfArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(new IntersectionOfArray().intersect(nums1, nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();

        for (int i : nums1) {
            m1.put(i , m1.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            m2.put(i , m2.getOrDefault(i, 0) + 1);
        }
        List<Integer> r = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : m1.entrySet()) {
            if (m2.containsKey(e.getKey())) {
                for (int i = 1; i <= Math.min(e.getValue(), m2.get(e.getKey())); i++) {
                    r.add(e.getKey());
                }
            }
        }

        int[] res = new int[r.size()];
        int k = 0;
        for (int i : r) {
            res[k++] = i;
        }

        return res;
    }
}
