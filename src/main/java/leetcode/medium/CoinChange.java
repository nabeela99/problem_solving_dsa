package leetcode.medium;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp [][] = new int[n+1][amount+1];
        dp[0][0]= Integer.MAX_VALUE -1;
        for (int i = 0 ; i <=n ; i++){
            for (int j = 0 ; j <= amount ; j++){
                if (i == 0 && j != 0){
                    dp[i][j] = Integer.MAX_VALUE -1;
                }else if (j == 0 && i != 0){
                    dp[i][j] = 0;
                }else if (i == 1 && j > 0){
                    if (j % coins[0] == 0){
                        dp[i][j] = j / coins[0];
                    }else{
                        dp[i][j] = Integer.MAX_VALUE -1;
                    }
                }
            }
        }
        for (int i = 2 ; i <=n ; i++){
            for (int j = 1 ; j <=amount ; j++){
                if (coins[i-1] <= j){
                    dp[i][j] = Math.min(1 + dp[i][j-coins[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }
    public static void main(String[] args) {
        int [] coins = {1,2,5};
        int sum = 11;
        System.out.println(coinChange(coins,sum));
    }
}
