class FrequencyTracker {
    Map<Integer,Integer> mp1;
    Map<Integer,Integer> mp2;
    public FrequencyTracker() {
        mp1 = new HashMap<>();
        mp2 = new HashMap<>();
    }
    
    public void add(int number) {
        int num = mp1.getOrDefault(number,0);
        if(num > 0){
            mp2.put(num,mp2.get(num)-1);
        }
        mp1.put(number,num+1);
        mp2.put(num+1,mp2.getOrDefault(num+1,0)+1);
    }
    
    public void deleteOne(int number) {
        int num = mp1.getOrDefault(number,0);
        if(num > 0){
            mp2.put(num,mp2.get(num)-1);
            mp1.put(number,num-1);
        }
        mp2.put(num-1,mp2.getOrDefault(num-1,0)+1);
    }
    
    public boolean hasFrequency(int frequency) {
        return mp2.getOrDefault(frequency,0) > 0;
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */