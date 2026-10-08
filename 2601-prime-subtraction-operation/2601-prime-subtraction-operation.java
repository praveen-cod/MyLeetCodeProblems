class Solution {
    public boolean primeSubOperation(int[] nums) {
        if(isValid(nums)) return true;
        int pre = 0;
        for(int i = 0;i<nums.length;i++){
            int n = nums[i]-pre;
            int p = -1;
            for(int j = 0;j<n;j++){
                if(isPrime(j) && j < n){
                    p = j;
                }
            }
            if(p!=-1){
                nums[i] -= p;
            }
            if(nums[i] <= pre) return false;
          
            if(isValid(nums)) return true;
            pre = nums[i];
        }
        return false;
    }
    public boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public boolean isValid(int[] nums){
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] >= nums[i+1]) return false;
        }
        return true;
    }
  
}