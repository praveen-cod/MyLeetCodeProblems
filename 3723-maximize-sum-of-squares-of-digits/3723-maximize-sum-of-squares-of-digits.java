class Solution {
    public String maxSumOfSquares(int num, int sum) {
       if(sum < 0 || sum > 9 *num) return "";
       StringBuilder sb = new StringBuilder();
        while (sb.length() < num) {
            int cur = Math.min(9, sum);
             sb.append(cur);
            sum -= cur;
        }

        return sb.toString();
    }
}