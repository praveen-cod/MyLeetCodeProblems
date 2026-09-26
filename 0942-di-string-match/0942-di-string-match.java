class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length()+1];
        int n = s.length();
        int left = 0;
        int right = n;
        int ind = 0;
        for(char c : s.toCharArray()){
            if(c == 'I') res[ind++] = left++;
            if(c == 'D') res[ind++] = right--;
        }
        res[n] = left;
        return res;
    }
}