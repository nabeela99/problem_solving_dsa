package leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddStrings {

    public static void main(String[] args) {
        String num1 = "1";
        String num2 = "9";
        System.out.println(new AddStrings().addStrings(num1, num2));
    }

    public String addStrings(String num1, String num2) {
        Deque<Integer> q = new ArrayDeque<>();
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while (i >= 0 || j >= 0){
            sum = 0;
            if (i >= 0){
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0){
                sum += num2.charAt(j) - '0';
                j--;
            }
            sum += carry;
            if (sum > 9){
                carry = sum / 10;
                sum = sum % 10;
            }else{
                carry = 0;
            }
            q.push(sum);
        }
        if (carry > 0){
            q.push(carry);
        }
        while(!q.isEmpty()) {
            sb.append(q.pop());
        }

        return sb.toString();
    }
}
