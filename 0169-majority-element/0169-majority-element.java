class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> mp = new LinkedHashMap<>();
       for(int n : nums)
        mp.put(n,mp.getOrDefault(n,0)+1);
        int n = nums.length/2;
        for(int i : mp.keySet()){
            if(mp.get(i) > n) return i;
        }
       return -1;
    }
}