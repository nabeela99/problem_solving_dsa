package Moutblue_Test;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i < 2 * n; i = i + 2) {
            for (int j = 2 * n; j > 2 * n - i; j--) {
                System.out.print(num);
            }
            for (int j = 0; j < 2 * n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
            num++;
        }
        int num1 = n-1;
        for (int i = 3; i <= 2 * n; i = i + 2) {
            for (int j = i ; j < 2*n; j++) {
                System.out.print(num1);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
            num1--;
        }
    }
}
