package mountblue_challenge;

public class FlippingBits {
    public static void main(String[] args) {
        long n = 123456;
        System.out.println(flippingBits(n));

    }
    public static long flippingBits(long n) {
        long[] binaryNum = new long[32];
        int i = 0;
        long sum = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int k = 0 ; k < binaryNum.length ; k++){
            if (binaryNum[k] == 1){
                binaryNum[k] = 0l;
            }else if (binaryNum[k] == 0){
                binaryNum[k] = 1l;
            }
        }
        for (int j = 0 ; j < binaryNum.length ;j++) {
            sum += binaryNum[j] * Math.pow(2,j);
        }

       return sum;
    }
}
