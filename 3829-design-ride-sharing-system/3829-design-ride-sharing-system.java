class RideSharingSystem {
    Queue<Integer> ride;
    Queue<Integer> drive;
    Set<Integer> st;
    Set<Integer>st1;
    public RideSharingSystem() {
       ride = new ArrayDeque<>();
       drive = new ArrayDeque<>();
       st = new HashSet<>(); 
       st1 = new HashSet<>();
    }
    
    public void addRider(int riderId) {
        ride.offer(riderId);
        st1.add(riderId);
    }
    
    public void addDriver(int driverId) {
        drive.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while(!ride.isEmpty() && st.contains(ride.peek())){
            st.remove(ride.poll());
        }
        if(ride.isEmpty() || drive.isEmpty()){
            return new int[]{-1,-1};
        }
        int rid = ride.poll();
        st.remove(ride);
        return new int[]{drive.poll(),rid};
    }
    
    public void cancelRider(int riderId) {
        if(st1.contains(riderId)){
            st1.remove(riderId);
        st.add(riderId);
        }
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */