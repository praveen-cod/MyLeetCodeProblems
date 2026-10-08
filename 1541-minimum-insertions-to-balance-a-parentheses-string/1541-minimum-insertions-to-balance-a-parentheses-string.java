class Solution {
    public int minInsertions(String s) {
        int i = 0;
        int l = 0;
        int c = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == '('){
                l++;
                i++;
            }
            else{
                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    if(l > 0) l--;
                    else c++;
                    i+=2;
                }
                else{
                    if(l > 0){
                        l--;
                        c++;
                    }
                    else c+=2;
                    i++;
                }
            }
        }
        c+=l*2;
        return c;
    }
}