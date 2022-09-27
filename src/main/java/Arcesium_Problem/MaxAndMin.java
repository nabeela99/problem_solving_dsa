package Arcesium_Problem;
import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        int [] a1 = {1,2,3,4,5};
        for (int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int min = a[0];
        int indexMax = 0;
        int indexMin = 0;
        int sum = 0;
        for (int i = 0 ; i < n ; i++){
            sum += a[i];
            if (a[i] > max){
                max = a[i];
                indexMax = i;
            }
            if (a[i] < min){
                min = a[i];
                indexMin = i;
            }
        }
        int sumMax = sum - a[indexMin];
        int sumMin = sum - a[indexMax];
        System.out.println(sumMax + " "+ sumMin);
    }
}
