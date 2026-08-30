class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        helper(new StringBuilder(), n, lst);
        return lst;
    }

    public void helper(StringBuilder sb,int n,List<String> lst){
        if(sb.length() == n*2){
            if(isValid(sb.toString()))
            lst.add(sb.toString());
            return;
        }
        sb.append("(");
        helper(sb,n,lst);
        sb.deleteCharAt(sb.length()-1);
        sb.append(")");
        helper(sb,n,lst);
        sb.deleteCharAt(sb.length()-1);
    }
    public boolean isValid(String s){
       int c1 = 0;
       for(char ch : s.toCharArray()){
        if(ch == '(') c1++;
        else c1--;
        if(c1 < 0) return false;
       }
       return c1 == 0;
    }
}