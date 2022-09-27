package Arcesium_Problem;

public class ReversePyramid {
    public static void main(String[] args) {
        int n;
        ReversePattern(5);
    }
    static void ReversePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = n-i; j > 0; j--) {
                System.out.print("* ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
