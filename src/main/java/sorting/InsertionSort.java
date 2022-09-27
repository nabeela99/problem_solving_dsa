package sorting;

public class InsertionSort {
    void sort2(int arr[]){
        int n= arr.length;
        for (int i =1 ; i<n ; i++) {
            int var = arr[i];
            for (int j = i - 1 ; j >= 0 ; j--) {
                if (var < arr[j]){
                    int temp =  arr[j];
                    arr[j] = var;
                    arr[j+1] = temp;


                }
            }
        }

    }
}
