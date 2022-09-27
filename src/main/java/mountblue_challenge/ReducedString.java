package mountblue_challenge;

import java.util.*;

public class ReducedString {
    public static void main(String[] args) {
        String s = "aaabccddd";
        System.out.println(ReducedString.superReducedString(s));
    }

    public static String superReducedString(String s) {
        //
        //abd
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            st.add(c);
        }
        Stack<Character> temp = new Stack<>();
        temp.push(st.pop());

        while(!st.isEmpty()) {
            Character q = st.pop();
            if(!temp.isEmpty() && temp.peek().equals(q)) {
                temp.pop();
            } else {
                temp.push(q);
            }

        }

        if(temp.isEmpty()) {
            return "Empty String";
        }
        for (char c :  temp) {
            sb.insert(0, c);
        }
        return sb.toString();
    }
}
