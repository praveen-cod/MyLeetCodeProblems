class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            List<Integer> cur = new ArrayList<>();
            int c = 1;
            int j = i+1;
            for(;j<s.length();j++){
                if(s.charAt(i) != s.charAt(j)) break;
                else c++;
            }
            if(c >= 3){
                cur.add(i);
                cur.add(j-1);
                res.add(cur);
                i = j-1;
            }
            
        }
        return res;
    }
}