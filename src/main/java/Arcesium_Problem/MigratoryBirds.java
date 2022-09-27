package Arcesium_Problem;

import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4)));
    }
    public static int migratoryBirds(List<Integer> arr) {
        int Max = 0;
        Set<Integer> maxstore = new HashSet<>();
        Map<Integer, Integer> birds = new HashMap();
        for (Integer i : arr) {
            birds.put(i, birds.getOrDefault(i, 0) + 1);
        }
        int maxvalue = Collections.max(birds.values());
      for (Map.Entry<Integer, Integer> values : birds.entrySet()) {
            if (values.getValue() == maxvalue) {
                maxstore.add(values.getKey());

            }

        }
        return maxstore.stream().findFirst().get();

    }
}
