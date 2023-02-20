package leetcode.hard;

import java.util.*;

public class Calculator {
    public static int calculate(String s) {
        Deque<String> st = new LinkedList<>();
        String temp = "+";
        st.push("+");
        StringTokenizer stk = new StringTokenizer(s, "()+- ", true);
        while ((stk.hasMoreTokens())) {
            String s1 = stk.nextToken();
            if (s1.trim().isEmpty()) {
                continue;
            }
            if (!s1.equals(")") && !s1.equals("(")) {
                if (temp.equals(s1)) {
                    if ((temp.equals("-") && s1.equals("-")) ||(temp.equals("+") && s1.equals("+"))){
                        st.pop();
                        s1 = "+";
                    }else if ((temp.equals("-") && s1.equals("+")) ||(temp.equals("+") && s1.equals("-"))){
                        st.pop();
                        s1 = "-";
                    }
                }
                temp = s1;
                st.push(s1);
            }
        }
        int res = operations(st, 0);
        st.add(Integer.toString(res));
        int ans = Integer.parseInt(st.peek());
        return ans;
    }
    public static int operations(Deque<String> s,int sum){
        if (s.isEmpty()){
            return sum;
        }
        int num = 0;
        if (!s.peek().equals("+") && !s.peek().equals("-")) {
            num = Integer.parseInt(s.poll());
        }
        if (s.peek().equals("+")){
            s.poll();
//            num = Integer.parseInt(s.poll());
            sum = sum + num;

        }else if (s.peek().equals("-")) {
            s.poll();
//            num = Integer.parseInt(s.poll());
            sum = sum - num;
        }
        return operations(s,sum);
    }

    public static void main(String[] args) {
        System.out.println(calculate("-2 + 1"));
    }
}
