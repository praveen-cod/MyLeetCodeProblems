class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> mp = new HashMap<>();
        while(n != 0){
            mp.put(n%10,mp.getOrDefault(n%10,0)+1);
            n/=10;
        }
        System.out.println(mp);
        int sum = 0;
       for(int i : mp.keySet()){
        int v = mp.get(i);
        sum += i*v;
       }
        return sum;
    }
}