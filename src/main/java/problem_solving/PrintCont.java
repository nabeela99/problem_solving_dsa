package problem_solving;

public class PrintCont {
    public static void main(String[] args) {
        String s = "aabbcaaaddbbccddd";
       // int arr[] = new int[s.length()];
        char temp ;
        int count = 1;
        temp = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == temp){
                count++;
            } else {
                System.out.print(count + "" + temp);
                temp = s.charAt(i);
                count = 1;
            }

            if( i  == s.length() - 1) {
                System.out.print(count + "" + temp);
            }
        }

    }
}

