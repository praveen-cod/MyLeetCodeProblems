class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int []min = new int[nums.length];
        int []max = new int[nums.length];
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max1 = Math.max(max1,nums[i]);
            max[i] = max1;
        }
        for(int i = nums.length-1;i>=0;i--){
            min1 = Math.min(min1,nums[i]);
            min[i] = min1;
        }
        for(int i = 0;i<nums.length;i++){
            if(max[i]-min[i]<=k)return i;
        }
        return -1;
    }
}