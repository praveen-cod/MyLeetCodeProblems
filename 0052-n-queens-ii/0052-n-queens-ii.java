class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] arr: board) Arrays.fill(arr,'.');
        helper(0,n,board);
        return count;
    }
    public boolean isSafe(int row,int col,int n,char[][] board){
        int r = row;
        int c = col;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = r;
        col = c;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row = r;
        col = c;
        while(row < n && col >= 0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
    public void helper(int col,int n,char[][]board){
        if(col == n){
            count++;
            return;
        }
        for(int i = 0;i<n;i++){
            if(isSafe(i,col,n,board)){
                board[i][col] = 'Q';
                helper(col+1,n,board);
                board[i][col] = '.';
            }
        }
    }
}