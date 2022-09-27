package problem_solving;
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class AlternativeSorting {

    public static List<Integer> countingSort(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int h = 0;
        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (h < i) {
                h = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i <= 100) {
            result.add(map.getOrDefault(i++, 0));
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,1,3,2,1);
        System.out.println(AlternativeSorting.countingSort(input));
    }

}



