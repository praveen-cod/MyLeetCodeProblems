class Solution {
   long mod = 1000000007L;
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> lst = new ArrayList<>();
        for(int n1 : nums) lst.add(n1);
        for(int i = 0;i<nums.length;i++){
            int sum = nums[i];
            for(int j = i+1;j<nums.length;j++){
                sum += nums[j];
                lst.add(sum);
            }
        }
        Collections.sort(lst);
        System.out.println(lst);
        long res = 0;
        for(int i = left-1;i<right;i++){
            res = (res+lst.get(i)) % mod;
        }
        return (int)res;
    }
}