//LeetCode Program:Best Time To Buy and Sell Stocks
//Link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

//Time Complexity:O(n)
//Space Complexity:O(1)

// ## Two  Pointers Approach

class Solution {
    public int maxProfit(int[] prices) {
         int minPrice = prices[0]; // Assume the first price is the minimum
        int maxProfit = 0; // Initialize max profit as 0

        for (int i = 1; i < prices.length; i++) {
            // Manually find the minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate the profit
            int profit = prices[i] - minPrice;

            // Manually update max profit if we find a better profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
        
    }
}
