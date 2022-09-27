package problem_solving;

public class PrintOrderA {
    public static void main(String[] args) {
        String s = "abcdeeedddffsss";
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            arr[index]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i]!=0) {
                System.out.print(arr[i] + "" + ((char) ('a'+ i)));
            }
        }
    }
}
