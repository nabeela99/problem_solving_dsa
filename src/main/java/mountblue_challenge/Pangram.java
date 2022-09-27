package mountblue_challenge;

public class Pangram {
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the prize";
        System.out.println(pangrams(s));
    }
    public static String pangrams(String s) {
        String st = s.toLowerCase();
        System.out.println(st);
        String str = st.replaceAll("\\s", "");
        System.out.println(str);
        char [] c = str.toCharArray();
        int [] a = new int [26];
        for (Character i : c){
            int d = i - 'a' ;
            a[d]++;
        }
        for (int i = 0; i < a.length ; i++){
            if (a[i] == 0){
                return "not pangram";
            }
        }
        return "pangram";

    }
}
