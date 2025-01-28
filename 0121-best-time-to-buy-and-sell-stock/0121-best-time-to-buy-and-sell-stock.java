class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyP = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < n; i++) {
            if(buyP < prices[i]) {
                int tempP = prices[i] - buyP;
                profit = Math.max(tempP, profit);
            }else {
                buyP = prices[i];
            }
        }
        return profit;
    }
}