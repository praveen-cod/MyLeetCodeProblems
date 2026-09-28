class Solution {
    public int minimumPairRemoval(int[] nums) {
      int c = 0;
      List<Integer> lst = new ArrayList<>();
      for(int n : nums) lst.add(n);
      while(!isSorted(lst)){
        c++;
        int ind = min(lst);
        int sum = lst.get(ind)+lst.get(ind+1);
        lst.set(ind,sum);
        lst.remove(ind+1);
      }  
      return c;
    }
    public boolean isSorted(List<Integer> lst){
        for(int i = 0;i<lst.size()-1;i++){
            if(lst.get(i) > lst.get(i+1)) return false;
        }
        return true;
    }
    public int min(List<Integer> lst){
        int min = Integer.MAX_VALUE;
        int ind = 0;
        for(int i = 0;i<lst.size()-1;i++){
            int sum = lst.get(i)+lst.get(i+1);
            if(sum < min){
                min = sum;
                ind = i;
            }
        }
        return ind;
    }
}