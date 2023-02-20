package leetcode.medium;

public class FromTheLand {
    public static int maxDistance(int[][] grid) {
        int n = grid.length;
        int dp [][] = new int[n][n];
        int dp1 [][] = new int[n][n];
        int max1 = 0;
        int max2 = 0;
        int max = 0;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                int up = 0;
                int down = 0;
                int left = 0;
                int right = 0;
                if(grid[i][j] == 0){
                    if(i > 0 && grid[i-1][j] >= 1){
                        up = grid[i-1][j];
                    }
                    if(j > 0 && grid[i][j-1] >= 1){
                        left = grid[i][j-1];
                    }
                    if(i+1 < n && grid[i+1][j] >= 1){
                        down = grid[i+1][j];
                    }
                    if(j+1 < n && grid[i][j+1] >= 1){
                        right = grid[i][j+1];
                    }
                    int left1 = 0;
                    int up1 = 0;
                    dp[i][j] = Math.max(up,Math.max(down,Math.max(left,right)));
                    if(dp[i][j] == 0) {
                        if (j > 0 && dp[i][j - 1] > 0) {
                            left1 = 1 + dp[i][j - 1];
                        }
                        if (i > 0 && dp[i-1][j] > 0) {
                            up1 = 1 + dp[i - 1][j];
                        }
                        if(left1 == 0 || up1 == 0){
                            dp[i][j] = Math.max(left1, up1);
                        }else {
                            dp[i][j] = Math.min(left1, up1);
                        }
                    }
                    if (dp[i][j] > max1){
                        max1 = dp[i][j];
                    }
                }else{
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = n - 1 ; i >= 0 ; i--){
            for (int j =  n - 1 ; j >= 0 ; j--){
                int up = 0;
                int down = 0;
                int left = 0;
                int right = 0;
                if(grid[i][j] == 0) {
                    if (i > 0 && grid[i - 1][j] >= 1) {
                        up = grid[i - 1][j];
                    }
                    if (j > 0 && grid[i][j - 1] >= 1) {
                        left = grid[i][j - 1];
                    }
                    if (i + 1 < n && grid[i + 1][j] >= 1) {
                        down = grid[i + 1][j];
                    }
                    if (j + 1 < n && grid[i][j + 1] >= 1) {
                        right = grid[i][j + 1];
                    }
                    dp1[i][j] = Math.max(up, Math.max(down, Math.max(left, right)));
                    int right1 = 0;
                    int down1 = 0;
                    if (dp1[i][j] == 0){
                        if (i + 1 < n && dp1[i+1][j] > 0) {
                            down1 = 1 + dp1[i + 1][j];
                        }
                        if (j + 1 < n && dp1[i][j+1] > 0) {
                            right1 = 1 + dp1[i][j + 1];
                        }
                        if (down1 == 0 || right1 == 0){
                            dp1[i][j] = Math.max(right1, down1);
                        }else {
                            dp1[i][j] = Math.min(right1, down1);
                        }
                    }
                    if (dp1[i][j] > max2 ){
                        max2 = dp1[i][j];
                    }
                }else{
                    dp1[i][j] = 1;
                }
            }
        }
        max = Math.max(max1,max2);
        if (max == 0){
            return -1;
        }
        return max;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,0,0},{0,0,0},{0,0,0}};
        System.out.println(maxDistance(arr));
    }
}
