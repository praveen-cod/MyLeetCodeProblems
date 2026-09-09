class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [][] dp = new int[n][n];
        for(int i = 0;i<n;i++) dp[n-1][i] = triangle.get(n-1).get(i);
        for(int i = n-2;i>=0;i--){
            for(int j = i;j>=0;j--){
                int top = triangle.get(i).get(j) + dp[i+1][j];
                int diag = triangle.get(i).get(j)+ dp[i+1][j+1];
                dp[i][j] = top < diag ? top : diag;
            }
        }
        return dp[0][0];
    }
}
// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int [][] dp  = new int[triangle.size()][triangle.get(triangle.size()-1).size()];
//         for(int []arr : dp)
//         Arrays.fill(arr,-1);
//         return helper(0,0,triangle,dp,triangle.size());
//     }
//     public int helper(int i,int j,List<List<Integer>> lst ,int[][] dp,int n){
//         if(i == n-1) {
//             System.out.println("1 = "+lst.get(n-1).get(j));
//         return lst.get(n-1).get(j);
//         }
//         if(dp[i][j] != -1){
//             System.out.println("1 = "+dp[i][j]);
//         return dp[i][j];
//         }
//         int down = helper(i+1,j,lst,dp,n);
//         int diag = helper(i+1,j+1,lst,dp,n);
//         dp[i][j] = lst.get(i).get(j) + Math.min(down,diag);
//         System.out.println("3 = "+dp[i][j]);
//         return dp[i][j];
//     }

// }
// tle