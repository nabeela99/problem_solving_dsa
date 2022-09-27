package mountblue_challenge;

public class RecursiveDigit {
    public static void main(String[] args) {
        String n;
        int k;
        System.out.println(superDigit("9875", 4));
    }
    public static int superDigit(String n, int k) {
        long sum = 0;
        while (n.length() > 1) {
            sum = 0;
            for (int i = 0; i < n.length(); i++) {
                sum += Integer.parseInt(String.valueOf(n.charAt(i)));
            }
            n = String.valueOf((sum * k));
            k = 1;
        }
        return (int) sum;
    }
}
