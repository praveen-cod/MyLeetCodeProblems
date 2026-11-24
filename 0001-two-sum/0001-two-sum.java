class Solution {
    public int[] twoSum(int[] nums, int target) {
       int []res = new int[2];
       HashMap<Integer,Integer>mp = new HashMap<>();
       for(int i = 0;i<nums.length;i++){
        int key = target-nums[i];
        if(mp.containsKey(key)){
            res[0] = mp.get(key);
            res[1] = i;
            return res;
        }
        mp.put(nums[i],i);
       } 
       return new int []{};
    }
}