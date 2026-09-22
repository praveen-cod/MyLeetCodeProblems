class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(n > 0) set.add(n);
        }
        int res = 1;
        while(set.contains(res)) res++;
        return res;
    }
}