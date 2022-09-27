package mountblue_challenge;

public class MarsSignal {
    public static void main(String[] args) {
        String s = "SOSSOSSOT";
        MarsSignal.marsExploration(s);
    }
    public static int marsExploration(String s) {
        int l = s.length();
        int num = l/3;
        String org = "S0S";
        int i =0;
        int j =0;
        int count =0;
        String expected [] = new String[num];
        String received [] = new String[] {s};
        for (int k =0; k< num ; k++) {
            System.out.println(expected[k]);
        }
        System.out.println(received);
//        while (i < num){
//            expected[i] = org;
//        }
//
        return count;

    }

}
