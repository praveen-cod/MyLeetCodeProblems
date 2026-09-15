class Solution {
    public String getPermutation(int n, int k) {
        List<String> lst = new ArrayList<>();
     String s = "";
     for(int i = 1;i<=n;i++) s+=i;
        helper(s.toCharArray(),new StringBuilder(),lst,n,new boolean[n]);
        return lst.get(k-1);
    }
    void helper(char[]arr,StringBuilder sb,List<String>lst,int n,boolean[] freq){
        if(sb.length() == n){
            lst.add(sb.toString());
            return;
        }
        for(int i = 0;i<n;i++){
            if(!freq[i]){
                freq[i] = true;
                sb.append(arr[i]);
                helper(arr,sb,lst,n,freq);
                sb.deleteCharAt(sb.length() -1);
                freq[i] = false;
            }
        }
    }
}