class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] arr = new int[mat.length][2];
        for(int i = 0;i<arr.length;i++){
            int c = 0;
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1) c++;
            }
            arr[i][0] = i;
            arr[i][1] = c;
        }
        int[] res = new int[k];
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        for(int i = 0;i<k;i++) res[i] = arr[i][0];
        return res;
    }
}