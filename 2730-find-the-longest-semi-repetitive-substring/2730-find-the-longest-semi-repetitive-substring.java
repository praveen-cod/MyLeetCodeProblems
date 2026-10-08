class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int max = 0;
        List<String> lst = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                lst.add(s.substring(i,j));
            }
        }
       for(String st : lst){
        int cur1 = 0;
        int cur2 = 1;
        for(int i = 0;i<st.length()-1;i++){
            if(cur2 > 2){
                cur1 = -1;
                break;
            }
            if(cur2 == 2){
                cur1++;
                cur2 = 1;
            }
            if(st.charAt(i) == st.charAt(i+1)) cur2++;
        }
        if(cur2 == 2) cur1++;
        if(cur1 != -1 && cur1 <= 1) max = Math.max(max,st.length());
       }
        return max;
    }
}