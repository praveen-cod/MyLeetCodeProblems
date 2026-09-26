class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int c = 0;
        for(int n : arr) sum += n;
        if(sum % 3 != 0) return false;
        sum /= 3;
        int cur = 0;
        for(int n : arr){
            cur += n;
            if(cur == sum){
                cur = 0;
                c++;
            }
        }
        return c >= 3;
    }
}