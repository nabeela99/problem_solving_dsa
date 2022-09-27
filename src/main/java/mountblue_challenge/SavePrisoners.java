package mountblue_challenge;

public class SavePrisoners {

    public static int saveThePrisoner(int n, int m, int s) {
        int pris;
        if (m >= n){
            m = (m - (n - s + 1)) ;
            pris = m % n;
            if (m % n == 0){
                pris = n;
            }
        }else {
            pris = m + s -1;
        }
        return pris;
    }
}
