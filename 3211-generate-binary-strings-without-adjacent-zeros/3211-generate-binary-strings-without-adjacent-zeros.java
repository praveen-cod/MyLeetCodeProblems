class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        helper(n,new StringBuilder(),res);
        return res;
    }
    public void helper(int n,StringBuilder sb,List<String>lst){
        if(sb.length() == n){
        if(!isAdjacent(sb.toString())){
            lst.add(sb.toString());
        }
            return;
        }
        sb.append("0");
        helper(n,sb,lst);
        sb.deleteCharAt(sb.length()-1);
        sb.append("1");
        helper(n,sb,lst);
        sb.deleteCharAt(sb.length()-1);
    }
    public boolean isAdjacent(String s){
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '0') return true;
        }
        return false;
    }
}