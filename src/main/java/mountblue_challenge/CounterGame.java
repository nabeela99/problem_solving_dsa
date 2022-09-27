package mountblue_challenge;

public class CounterGame {
    public static void main(String[] args) {
        long n = 1463674015;
        System.out.println(counterGame(n));
    }

    public static String counterGame(long n) {
        long i;
        long count = 0;
        long num;
        while (n > 1) {
            i = 0;
            double sq = Math.sqrt(n);
            long sqi = (long) Math.sqrt(n);
            if (sq != sqi) {
                while (sq != sqi) {
                    i++;
                    num = n - i;
                    sq = Math.sqrt(num);
                    sqi = (long) Math.sqrt(num);
                }
                count++;
            } else {
                i = n / 2;
                count++;
            }
            n = i;
        }
      if (count % 2 == 0){
          return "Richard";
      }else {
          return "Louise";
      }
    }
}
