package Arcesium_Problem;

import java.sql.SQLOutput;
import java.util.Stack;

public class SuperRedString {
    public static void main(String[] args) {
        String s;
        System.out.println(superReducedString("abba"));
    }
    public static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        Stack<Character> temp = new Stack<>();
        for (char c : s.toCharArray()){
            stk.push(c);
        }
        temp.push(stk.pop());
        while(!stk.isEmpty()) {
            Character a = stk.pop();
            if (temp.peek().equals(a)) {
                temp.pop();
            } else {
                temp.push(a);
            }
        }
        for (char d : temp){
            sb.append(d);
        }
        String st = sb.toString();
        if (!temp.isEmpty()){
            return st;
        }else
        return "Empty String";
    }
}
