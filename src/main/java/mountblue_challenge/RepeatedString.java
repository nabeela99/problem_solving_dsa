package mountblue_challenge;

public class RepeatedString {
    public static void main(String[] args) {
        String s ;
        long n ;
        System.out.println(repeatedString("a", 1000000000));
    }

    public static long repeatedString(String s, long n) {
//        long aCount = s.chars().filter(value -> value == 'a').count();
//        long t = n / s.length();
//        long mod = n % s.length();
//        int i = -1;
//        long res = t * aCount;
//        while (mod > 0 && i++ < mod) {
//            if (s.charAt(i) == 'a') {
//                res++;
//            }
//        }
//        return res;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        char [] ch = s.toCharArray();
        while(sb.length() < n){
            for (int i = 0 ; i < s.length() ; i++){
                sb.append(ch[i]);
            }
        }
        if (sb.length() > n){
            for (int i = 0 ; i < n ; i++){
                sb1.append(sb.charAt(i));
            }
        }else{
            sb1.append(sb);
        }
        String st = sb1.toString();
        int [] arr = new int [26];
        for (Character c : st.toCharArray()){
            arr[c - 'a']++;
        }
        long res = arr[0];
        return res;
    }
}
