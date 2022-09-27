package problem_solving;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


public class BracketBalancing {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i < s.length() ;i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
                continue;
            }
            if (st.isEmpty()) {
                return "NO";
            }
            if (c == '}') {
                char p = st.pop();
                if (p == '(' || p == '[') {
                    return "NO";
                }
            } else if (c == ']') {
                char p = st.pop();
                if (p == '(' || p == '{') {
                    return "NO";
                }
            } else if (c == ')') {
                char p = st.pop();
                if (p == '{' || p == '{') {
                    return "NO";
                }
            }
        }
        if (st.isEmpty()){
            return "YES";
        }
        return "NO";


//        Deque<Character> stack
//                = new ArrayDeque<Character>();
//
//        // Traversing the Expression
//        for (int i = 0; i < s.length(); i++)
//        {
//            char x = s.charAt(i);
//
//            if (x == '(' || x == '[' || x == '{')
//            {
//                stack.push(x);
//                continue;
//            }
//            if (stack.isEmpty())
//                return false;
//            char check;
//            switch (x) {
//                case ')':
//                    check = stack.pop();
//                    if (check == '{' || check == '[')
//                        return false;
//                    break;
//
//                case '}':
//                    check = stack.pop();
//                    if (check == '(' || check == '[')
//                        return false;
//                    break;
//
//                case ']':
//                    check = stack.pop();
//                    if (check == '(' || check == '{')
//                        return false;
//                    break;
//            }
//        }
//
//        return (stack.isEmpty());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();
                String result = BracketBalancing.isBalanced(s);

                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

