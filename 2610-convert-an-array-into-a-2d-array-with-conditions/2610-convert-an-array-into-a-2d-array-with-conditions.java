class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        while(true){
            if(isValid(nums)) break;
            Set<Integer> st = new HashSet<>();
            List<Integer> cur = new ArrayList<>();
            for(int i = 0;i<nums.length;i++){
                if(st.contains(nums[i]))
                    continue;
                else{
                    if(nums[i] != 0){
                    st.add(nums[i]);
                    cur.add(nums[i]);
                    nums[i] = 0;
                    }
                }
            }
            lst.add(cur);
        }
        return lst;
    }
    public boolean isValid(int[] nums){
        for(int n : nums)
            if(n != 0) return false;
        return true;
    }
}