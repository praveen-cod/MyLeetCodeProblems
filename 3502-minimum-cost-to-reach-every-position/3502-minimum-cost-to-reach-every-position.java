class Solution {
    public int[] minCosts(int[] cost) {
        for (int i = 1; i < cost.length; i++)
            cost[i] = cost[i - 1] < cost[i] ? cost[i - 1] : cost[i];
        return cost;
    }
}