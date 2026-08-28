class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            int ind = t.indexOf(s.charAt(i));
            System.out.println(ind);
            sum += abs(i-ind);
        }
        return sum;
    }
    int abs(int sum){
        return sum < 0 ? -sum : sum;
    }
}