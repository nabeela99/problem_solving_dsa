package coupa_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        Arrays.sort(a);
        int count=0;
        for (int i = 0; i < n; i++){
            if(b[i] == a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
