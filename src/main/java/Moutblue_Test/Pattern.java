package Moutblue_Test;

public class Pattern {

    public static void main(String[] args) {
        int n =  7;
        int i = 1;
        int printC = 1;
        int x = 0;
        int p = 1;
        while (i < 2 * (n + 1) && printC < 3) {
            if (i > n) {
                if (p > n) {
                    p = p -1;
                    x = 0;
                }
                printC++;
                print(--p, x--, true);
            } else {
                print(p++, x++, false);
            }
            i++;
        }
    }

    static void print(int n, int x, boolean isReverse) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        if (isReverse) {
            for (int i = n + x; i > 1 ; i --) {
                System.out.print(n);
            }
        } else {
            for (int i = 0; i < n + x ; i ++) {
                System.out.print(n);
            }
        }
        System.out.println();
    }
}
