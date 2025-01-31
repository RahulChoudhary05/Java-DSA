package LeetCode;

public class Question121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int sell = prices[i];
            if (sell > buy) {
                profit = Math.max(profit, sell - buy);
            } else {
                buy = sell;
            }
        }
        return profit;
    }
}
