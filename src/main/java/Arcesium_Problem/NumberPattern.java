package Arcesium_Problem;

public class NumberPattern {
    public static void main(String[] args) {
        int n;
        numPattern(10);
    }

    static void numPattern(int n) {
        for (int i = 0; i < n; i++) {
            if (i < n/2){
                for (int j = n/2-i; j > 0; j--) {
                    System.out.print(n/2 - i);
                }
            }else {
                for (int j =i - n/2+1 ; j > 0; j--) {
                    System.out.print(i - n/2 +1);
                }
            }
            System.out.println();
        }
    }
}

