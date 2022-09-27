package mountblue_challenge;

public class AppendAndDelete {
    public static void main(String[] args) {
        String s = "zzzzz";
        String t = "zzzzzzz";
        int k = 4;
        System.out.println(appendAndDelete(s,t,k));
    }
    public static String appendAndDelete(String s, String t, int k) {
        if (s.equals(t)){
            return "Yes";
        }
        int counts = 0;
        int countt = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < Math.min(t.length(),s.length()) ; i++){
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            }else{
                break;
            }
        }
        counts = s.length() - count;
        if (t.length() == counts){
            if (t.length() <= k){
                return "Yes";
            }else {
                return "No";
            }
        }else
            countt = t.length()- (count);
            count = counts + countt;
        if (count <= k){
            return "Yes";
        }
        return "No";

    }
}
