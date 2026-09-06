class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(discounts);
        Arrays.sort(prices);
        double sum = 0;
        int i = prices.length-1;
        int j = discounts.length-1;
        while(i >= 0 && j >= 0){
            int p = prices[i];
            int d = discounts[j];
            sum += (p * (100-d)/100.0);
            i--;
            j--;
        }
        while(i >= 0) sum+=prices[i--];
        return sum;
    }
}