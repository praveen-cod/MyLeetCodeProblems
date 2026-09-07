class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            int z = 0;
            int o = 0;
            for(int j = i;j<s.length();j++){
                char ch = s.charAt(j);
                if(ch == '0') z++;
                else o++;
                if(o <= k || z <= k) count++;
            }
        }
        return count;
    }
}