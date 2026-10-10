class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i]*=2;
                nums[i+1] = 0;
            }
        }
        int ind = 0;

        for(int n : nums){
            if(n != 0) nums[ind++] = n;
        }
        for(int i = ind;i<nums.length;i++) nums[i] = 0;
        return nums;
    }
}