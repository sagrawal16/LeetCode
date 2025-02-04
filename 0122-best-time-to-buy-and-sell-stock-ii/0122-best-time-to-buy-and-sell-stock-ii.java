class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int buyprice =Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(buyprice<prices[i]){
                profit = profit + prices[i] - buyprice;
                buyprice = prices[i];
            }else{
                buyprice = prices[i];
            }
        }
        return profit;
    }
}