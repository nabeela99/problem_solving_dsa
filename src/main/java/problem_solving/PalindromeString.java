package problem_solving;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "Anne,    I vote more cars race Rome-to- Vienna";
        System.out.println(checkPalindrome(s));
    }
    static boolean checkPalindrome(String s){
        int i = 0;
        String str = s.toLowerCase();
        String st = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(st);
        int j = st.length()-1;
        while (i < st.length() && j >= 0){
            if (st.charAt(i) != st.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
