package leetcode.medium;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<String> st = new Stack();
        Stack <String> st1 = new Stack();
        int num = 0;
        int count = 0;
        for (int i = 0 ; i < s.length() ; i++){
            st.push(s.charAt(i) + "");
            StringBuilder sb = new StringBuilder();
            StringBuilder num1 = new StringBuilder();
            if (st.peek().equals("]")) {
                st.pop();
                while (!st.peek().equals("[")) {
                    st1.push(st.pop());
                }
                st.pop();
                while (!st.isEmpty()){
                    if ((st.peek().matches(".*[0-9].*"))){
                        num1.append(st.pop());
                    }else{
                        break;
                    }
                }
                num1 = num1.reverse();
                num = Integer.parseInt(num1.toString());
                while (!st1.isEmpty()) {
                    sb.append(st1.pop());
                }
                while (num > 0) {
                    res.append(sb);
                    num--;
                }
                st.push(res.toString());
                res = new StringBuilder();
            }
        }
        while (!st.isEmpty()){
            st1.push(st.pop());
        }
        while (!st1.isEmpty()){
            res.append(st1.pop());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "100[leetcode]";
        System.out.println(decodeString(s));
    }
}
