class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int curProfit = prices[i] - min;
            min = Math.min(prices[i], min);
            maxProfit = Math.max(curProfit, maxProfit);
        }
        return maxProfit;
    }
}
