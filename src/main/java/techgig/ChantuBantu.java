package techgig;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChantuBantu {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int testcases = Integer.parseInt(sc.nextLine());
            while (testcases-- > 0) {
                int n = Integer.parseInt(sc.nextLine());
                int g = Integer.parseInt(sc.nextLine());
                List<Integer> priceList = Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .sorted().collect(Collectors.toList());
                int sum = 0;
                for (int i=0 ; i< n ; i++){
                    sum += priceList.get(i);
                }
                System.out.println(sum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
