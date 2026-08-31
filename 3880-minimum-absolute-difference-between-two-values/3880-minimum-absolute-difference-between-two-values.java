class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int c = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == 1 && nums[j] == 2){
                    c = min(c,abs(i-j));
                }
            }
        }
        return c == Integer.MAX_VALUE ? -1 : c;
    }
    int min(int n1,int n2){
        return n1 < n2 ? n1 : n2;
    }
    int abs(int n){
        return n < 0 ? -n : n;
    }
}
