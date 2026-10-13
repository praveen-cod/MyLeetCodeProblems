class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[][] arr = new long[nums.length][2];
        for(int i = 0;i<nums.length;i++){
            arr[i][0] = nums[i];
            arr[i][1] = (nums[i]*nums[i]);
        }
        Arrays.sort(arr,(a,b)->Long.compare(a[1],b[1]));
        int ind = 0;
        long[] res = new long[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(i%2 != 0) res[i] = -arr[ind++][1];
        }
        for(int i = 0;i<nums.length;i++){
            if(i%2 == 0) res[i] = arr[ind++][1];
        }
        long sum = 0;
        for(long n : res) sum += n;
        return sum;
    }
}