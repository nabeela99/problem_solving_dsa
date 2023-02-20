package GeeksForGeeks;

public class SortArray {
    public static void sort012(int a[], int n)
    {
        int count = 0;
        int i = 0;
        while (i < n-1){
            if (a[i] > a[i+1]){
                while (count >= 0){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    i--;
                    count--;
                }
                count = 0;
            }else if (a[i] == a[i+1]){
                i++;
                count++;
            }else{
                i++;
            }
        }
        for (int j = 0 ; j < a.length ; j++){
            System.out.print(a[j] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int [] arr = {0,2,1,2,0};
        sort012(arr,n);
    }
}
