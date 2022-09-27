package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavelinThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list1 = new ArrayList<>();
        List<List<String>> list2 = new ArrayList<>();
        int i = 0;
        int j = 0;
        sc.nextLine();
        while (i < n){
            while (j < 4) {
                list1.add(sc.nextLine());
                j++;
            }
            list2.add(list1);
            i++;
        }
        sc.close();
        for (int k = 0 ; k < n ; k++) {
            for (int l = 0; l < 4; k++) {
                System.out.println(list2.get(k).get(l));
            }
        }
    }
}
