class Solution {
    public String maximumTime(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(s.charAt(0) == '?' && s.charAt(1) == '?'){
            sb.setCharAt(0,'2');
            sb.setCharAt(1,'3');
        }
        else if(s.charAt(0) == '?' && s.charAt(1)-'0' >= 4) sb.setCharAt(0,'1');
        else if(s.charAt(0) == '?' && s.charAt(1)-'0' <  4) sb.setCharAt(0,'2');
        else if(s.charAt(1) == '?' && s.charAt(0)-'0' <  2) sb.setCharAt(1,'9');
        else if(s.charAt(1) == '?' && s.charAt(0)-'0' == 2) sb.setCharAt(1,'3');
        if(s.charAt(3) =='?' && s.charAt(4) == '?'){
            sb.setCharAt(3,'5');
            sb.setCharAt(4,'9');
        }  
        else if(s.charAt(3) == '?') sb.setCharAt(3,'5');
        else if(s.charAt(4) == '?') sb.setCharAt(4,'9');
        return sb.toString();
    }
}