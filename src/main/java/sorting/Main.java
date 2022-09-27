package sorting;

public class Main {
    public static void main(String args[]){
        int arr[] = {10,15,3,2,8};
        InsertionSort sc = new InsertionSort();
        sc.sort2(arr);
        for (int i =0 ;i<arr.length ;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
