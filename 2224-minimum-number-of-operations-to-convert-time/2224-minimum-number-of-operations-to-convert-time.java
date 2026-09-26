class Solution {
    public int convertTime(String current, String correct) {
        int hr1 = Integer.parseInt(current.substring(0,2));
        int min1 = Integer.parseInt(current.substring(3));
        int hr2 = Integer.parseInt(correct.substring(0,2));
        int min2 = Integer.parseInt(correct.substring(3));
        int sum1 = (hr1 * 60 + min1);
        int sum2 = (hr2 * 60 + min2);
        int res = sum2 - sum1;
        int c = 0;
        while(res >= 60){
            c++;
            res -= 60;
        }
        while(res >= 15){
            c++;
            res -= 15;
        }
        while(res >= 5){
            c++;
            res -= 5;
        }
        while(res > 0){
            c++;
            res--;
        }
        return c;
    }
}