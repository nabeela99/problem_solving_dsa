package sorting;

public class BubbleSort {
    void sort1(int arr[]){
        for (int i =0 ;i<arr.length ;i++){
            for (int j =i+1 ;j<arr.length ;j++) {
                if (arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
