class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>mp = new HashMap<>();
        for(int n : nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int cond = nums.length/3;
        List<Integer>lst = new ArrayList<>();
        for(int n : mp.keySet()){
            int val = mp.get(n);
            if(val > cond){
                lst.add(n);
            }
        }
        return lst;
    }
}