public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int index = 0;
        int profit =0;
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i]-prices[index] > profit)
                profit = prices[i]-prices[index];
            if (prices[i] < prices[index])
                index = i;
        }
        return profit;
    }
}
