class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int []arr : dp)
        Arrays.fill(arr,-1);
        return helper(0,0,grid,dp);
    }
    int helper(int i ,int j,int[][] grid,int[][] dp){
        if(i >= grid.length || j >= grid[0].length)
            return 100000000;
        if(i == grid.length-1 && j == grid[0].length-1)
            return grid[i][j];
        if(dp[i][j] != -1)
            return dp[i][j];
        int down = helper(i+1,j,grid,dp);
        int right = helper(i,j+1,grid,dp);
        dp[i][j] = grid[i][j]+Math.min(down,right);
        return dp[i][j];
    }
}
// class Solution {
//     public int minPathSum(int[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
//         int[][] dp = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (i == 0 && j == 0)
//                     dp[i][j] = grid[0][0];
//                 else if (i == 0) {
//                     dp[i][j] = grid[i][j] + dp[i][j - 1];
//                 } else if (j == 0) {
//                     dp[i][j] = grid[i][j] + dp[i - 1][j];
//                 } else {
//                     int down = grid[i][j] + dp[i - 1][j];
//                     int right = grid[i][j] + dp[i][j - 1];
//                     dp[i][j] = right < down ? right : down;
//                 }
//             }
//         }
//         return dp[n - 1][m - 1];
//     }
// }