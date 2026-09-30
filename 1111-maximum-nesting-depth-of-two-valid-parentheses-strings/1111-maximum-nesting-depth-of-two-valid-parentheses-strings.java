class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] arr = new int[seq.length()];
        int ind = 0;
        int d = 0;
        for(char ch : seq.toCharArray()){
            if(ch == '('){
                d++;
                arr[ind++] = d%2;
            }
            else{
                arr[ind++] = d%2;
                d--;
            }
        }
        return arr;
    }
}