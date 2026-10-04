class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
             int[] freq = new int[26];
            for(int j = i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                sum += max(freq) - min(freq);
            }
            
        }
        return sum;
    }
    int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int n : arr){
            if(n != 0) min = n < min ? n : min;
        }
        return min;
    }
    int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int n : arr){
            if(n != 0) max = n > max ? n : max;
        }
        return max;
    }
}