package problem_solving;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MaximumElement {
    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> st = new Stack<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (String operation : operations) {
            char a = operation.charAt(0);
            if (a == '1') {
                int b = Integer.parseInt(operation.substring(2));
                st.push(b);
                if (temp.isEmpty() || b > temp.get(temp.size() - 1)) {
                    temp.add(b);
                }
            } else if (a == '2') {
                if (!st.isEmpty()) {
                    if (temp.get(temp.size() - 1) == st.peek()) {
                        temp.remove(temp.size() - 1);
                    }
                    st.pop();
                }
            } else if (a == '3') {
                res.add(temp.get(temp.size() - 1));
            }
        }
        return res;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> res = MaximumElement.getMax(ops);
        System.out.println(res);
        bufferedReader.close();
    }
}

