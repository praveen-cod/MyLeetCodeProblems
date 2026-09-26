class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> mp = new HashMap<>();
        for(List<String> lst : knowledge) mp.put(lst.get(0),lst.get(1));
       StringBuilder sb = new StringBuilder();
       for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        StringBuilder sb1 = new StringBuilder();
        if( ch == '('){
            int j = i+1;
            for(;j<s.length();j++){
                if(s.charAt(j) == ')') break;
                sb1.append(s.charAt(j));
            }
            if(mp.containsKey(sb1.toString())){
                sb.append(mp.get(sb1.toString()));
            }
            else sb.append("?");
            i = j;
        }
        else sb.append(ch);
       }
        // String res = sb.toString().replaceAll("\\(","");
        return sb.toString();
    }
}