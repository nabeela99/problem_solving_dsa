package problem_solving;

public class SherlockAndSquares {

    public static void main(String[] args) {
        System.out.println(squares(100, 1000));
    }

    public static int squares(int a, int b) {
        double s = Math.sqrt(a);
        int f = (int) Math.floor(s);
        if (s % 1 == 0) {
            f --;
        }
        int f1 = (int) Math.floor(Math.sqrt(b));

        return f1 - f;
    }
}
