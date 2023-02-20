package leetcode.medium;

import java.util.Arrays;

public class ZeroMatrix {
    public static int[][] updateMatrix(int[][] mat) {
        int [][] res = new int[mat.length][mat[0].length];
        for (int i = 0 ; i < mat.length ; i++){
            for (int j = 0 ; j < mat[0].length ; j++){
                if (mat[i][j] == 0){
                    res[i][j] = 0;
                }else{
                    int [] c = {0,0,0,0};
                    int [] c1 = {0,0,0,0};
                    res[i][j] = checkMatrix(mat,i,j,0,c,c1);
                }
            }
        }
        return res;
    }

    public static int checkMatrix(int[][] arr,int x , int y,int z,int[] count,int[] count1){
        if (arr[x][y] == 0){
            count[z] = 1;
            return 0;
        }
        if (x-1 >= 0 && count[z] == 0){
            count1[0]++;
            checkMatrix(arr,x-1,y,0,count,count1);
        }
        if (y-1 >= 0 && count[z] == 0){
            count1[1]++;
            checkMatrix(arr,x,y-1,1,count,count1);
        }
        if (x+1 < arr.length && count[z] == 0){
            count1[2]++;
            checkMatrix(arr,x+1,y,2,count,count1);
        }
        if (y+1 < arr[0].length && count[z] == 0){
            count1[3]++;
            checkMatrix(arr,x,y+1,3,count,count1);
        }
        return count1[z];
    }
    public static void main(String[] args) {
        int [][] ar = {{1,0,1},{1,1,1},{1,0,1}};
        int [][] result = updateMatrix(ar);
        for (int i = 0 ; i < ar.length ; i++){
            for (int j = 0 ; j < ar[0].length ; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}
