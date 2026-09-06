class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minValue;
            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit, profit);
        }
        return (maxProfit < 0)? 0 : maxProfit;
    }
}
