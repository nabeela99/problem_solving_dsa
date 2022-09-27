package problem_solving;
import java.io.*;
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

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 3;

        List<List<Integer>> arr = new ArrayList<>();
        String s = "1 2 3 4 5 ";

        IntStream.range(0, n).forEach(i -> {
            arr.add(
                    Stream.of(s.split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
        });

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
//        3
//        11 2 4
//        4 5 6
//        10 8 -12
//        arr.get(0);
        int a=0;
        int b=0;
        int n = arr.size();
        for (List<Integer> list : arr) {
            for (Integer i : list) {
                a += arr.get(i).get(i);
                b += arr.get(i).get(n-i);


            }
        }
        int c = Math.abs(a-b);
        return c;
    }
}



