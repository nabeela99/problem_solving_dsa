package mountblue_challenge;

import java.math.BigInteger;

public class BDay {

    public static void main(String[] args) {
        System.out.println(taumBday(1, 2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        BigInteger c;
        if (bc > wc + z){
            Long l = 0l;
            c = BigInteger.valueOf(Long.valueOf(w) * Long.valueOf(wc)).add(BigInteger.valueOf((Long.valueOf(b) * (Long.valueOf(wc) + Long.valueOf(z)))));
        }else if (wc > bc + z){
            c = BigInteger.valueOf(Long.valueOf(b) * Long.valueOf(bc)).add(BigInteger.valueOf((Long.valueOf(w) * (Long.valueOf(bc) + Long.valueOf(z)))));
        }else {
            c = BigInteger.valueOf((Long.valueOf(b) * Long.valueOf(bc))).add(BigInteger.valueOf((Long.valueOf(w) * Long.valueOf(wc))));
        }
        return c.longValue();

    }
}
