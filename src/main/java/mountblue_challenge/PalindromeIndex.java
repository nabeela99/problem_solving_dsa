package mountblue_challenge;

public class PalindromeIndex {
    public static void main(String[] args) {
        String s;
        System.out.println(palindromeIndex("abbcdda"));
    }
    public static int palindromeIndex(String s) {
        int i = 0;
        int res = -1;
        int index = 0;
        int mid = (s.length()-1)/2;
        while (i <= mid) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                index = s.length() - 1 - i;
                    if (s.charAt(i+1) != s.charAt(index)) {
                        res = index;
                    }else{
                        res = i;
                    }
                    break;
            }
            else {
                i++;
            }
        }
        return res;
    }
}
