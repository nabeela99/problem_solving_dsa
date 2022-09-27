package sorting;

public class SelectionSort {
    void sort(int arr[]){
        int n = arr.length;
        for (int i=0 ; i<n ; i++){
           int min=i;
            for (int j=i+1; j<n ; j++){
                if(arr[j] < arr[min]){
                    min=j;
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {10,15,4,2,8};
        SelectionSort sc = new SelectionSort();
        sc.sort(arr);
        for (int i =0 ;i<arr.length ;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
