package problem_solving;

import java.util.Scanner;

public class MissingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findTheDigit(str));
    }
    static String findTheDigit(String s){
        String res = "";
        String [] st = s.split(" ");
        String a = st[0];
        String operator = st[1];
        String b = st[2];
        String result = st[4];
        int val = 0;
        String target= "";
        if (result.contains("x")){
            target = result;
            int first = Integer.parseInt(a);
            int second = Integer.parseInt(b);
            if (operator.equals("+")){
                val = first + second;
            }else if (operator.equals("-")){
                val = first - second;
            }else if (operator.equals("*")){
                val = first * second;
            }else if (operator.equals("/")){
                val = first / second;
            }
        }else if (a.contains("x")){
            target = a;
            int first = Integer.parseInt(result);
            int second = Integer.parseInt(b);
            if (operator.equals("+")){
                val  = first - second;
            }else if (operator.equals("-")){
                val = first + second;
            }else if (operator.equals("*")){
                val = first / second;
            }else if (operator.equals("/")){
                val = first * second;
            }
        }else if (b.contains("x")){
            target = b;
            int first = Integer.parseInt(result);
            int second = Integer.parseInt(a);
            if (operator.equals("+")){
                val  = first - second;
            }else if (operator.equals("-")){
                val = first + second;
            }else if (operator.equals("*")){
                val = first / second;
            }else if (operator.equals("/")){
                val = second / first;
            }
        }
        int ValueOfX = 0;
        for (int i = target.length()-1 ; i >= 0 ; i--){
            if(target.charAt(i) == 'x'){
                ValueOfX = val % 10;
            }else{
                val = val / 10;
            }
        }
        return ValueOfX + res;
    }
}
