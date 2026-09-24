class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<grid.length;i++){
            Arrays.sort(grid[i]);
            for(int j = grid[i].length-1;j>=grid[i].length-limits[i];j--) pq.offer(grid[i][j]);
        }
        long sum = 0;
        for(int i = 0;i<k;i++) sum += pq.poll();
        return sum;
    }
}