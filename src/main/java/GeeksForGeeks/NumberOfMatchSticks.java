package GeeksForGeeks;

import java.util.Stack;

public class NumberOfMatchSticks {
    public static  int find(int a[], int n){
        int i = 0;
        int k = n-1;
        Stack<Integer> st = new Stack<>();
        Stack <Integer> st1 = new Stack<>();
        while (i < n-1){
            st.push(Math.abs(a[i+1]-a[i]));
            i = i + 2;
        }
        if (n % 2 != 0){
            st.push(a[n-1]);
        }
        while (st.size() != 1 && st1.size() != 1){
            Stack <Integer> s = new Stack<>();
            Stack <Integer> s1 = new Stack<>();
            if (!st.isEmpty()){
                s = st;
                s1 = st1;
            }else{
                s = st1;
                s1 = st;
            }
            while (!s.isEmpty()){
                if (s.size() % 2 != 0){
                    s1.push(s.pop());
                }
                int first = s.pop();
                int second = s.pop();
                int dif = Math.abs(second-first);
                if ((dif != 0) || (dif == 0 && s1.isEmpty())){
                    s1.push(dif);
                }
            }
            st = s;
            st1 = s1;
        }
        int res = 0;
        if (!st.isEmpty()){
            res = st.peek();
        }else{
            res = st1.peek();
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int n = 4;
        System.out.println(find(arr,n));
    }
}
