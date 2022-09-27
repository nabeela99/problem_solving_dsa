package mountblue_challenge;

public class NumbersRange {
    public static void main(String[] args) {
        int p;
        int q;
        kaprekarNumbers(1, 100);
    }
    public static void kaprekarNumbers(int p, int q) {
        int i = p;
        int count = 0;
        while(i <= q){
            long z = 0;
            String st = i + "";
            int d = st.length();
            long sqr = i * i;
            String sqt = sqr + "";
            if (sqt.length() == 1){
                z = 0;
            }else {
                int dif = sqt.length() - d;
                long x = Long.parseLong(sqt.substring(0, dif));
                long y = Long.parseLong(sqt.substring(dif));
                z = x + y;
                }
            if (z == i) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        if (count == 0){
            System.out.println("INVALID RANGE");
        }

    }

}
