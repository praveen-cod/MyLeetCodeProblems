class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int n : nums){
            if(sum < 0) sum = 0;
            sum += n;
            max = sum > max ? sum : max;
        }
        return max;
    }
}