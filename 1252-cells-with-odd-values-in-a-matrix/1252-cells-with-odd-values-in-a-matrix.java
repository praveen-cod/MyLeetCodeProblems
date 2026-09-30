class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][] mat = new int[m][n];
        for(int[] arr : indices){
            for(int i = 0;i<n;i++){
                mat[arr[0]][i]++;
            }
            for(int i = 0;i<m;i++){
                mat[i][arr[1]]++;
            }
        }
        int c = 0;
        for(int[] arr : mat){
            for(int i : arr){
                if((i&1) == 1) c++;
            }
        }
        return c;
    }
}