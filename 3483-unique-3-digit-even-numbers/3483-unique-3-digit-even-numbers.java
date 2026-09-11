class Solution {
    Set<Integer>set = new HashSet<>();
    public int totalNumbers(int[] digits) {
        List<String>lst = new ArrayList<>();
        helper(0,new StringBuilder(),digits,lst);
        for(String s : lst){
            helper2(s.toCharArray(),new StringBuilder(),new boolean[3]);
        }
        return set.size();
    }
    void helper(int st,StringBuilder sb,int[]arr,List<String>lst){
        if(st == arr.length){
            if(sb.length() == 3)
                lst.add(sb.toString());
            return;
        }
        sb.append(""+arr[st]);
        helper(st+1,sb,arr,lst);
        sb.deleteCharAt(sb.length()-1);
        helper(st+1,sb,arr,lst);
    }
    void helper2(char[]arr,StringBuilder sb,boolean[] freq){
        if(sb.length() == arr.length){
            int val = Integer.parseInt(sb.toString());
            String cur = ""+val;
            if(cur.length() == 3){
                if(val%2 == 0) set.add(val);
            }
             return;
            }
        for(int i = 0;i<arr.length;i++){
            if(!freq[i]){
                sb.append(arr[i]);
                freq[i] = true;
                helper2(arr,sb,freq);
                sb.deleteCharAt(sb.length()-1);
                freq[i] = false;
            }
        }
    }
}