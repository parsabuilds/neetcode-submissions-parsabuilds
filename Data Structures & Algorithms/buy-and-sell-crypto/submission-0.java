class Solution {
    public int maxProfit(int[] prices) {
        // Brute Froce Approach 
        int maxProfit = 0; 
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int difference = prices[j] - prices[i]; 
                if (difference > maxProfit) {
                    maxProfit = difference;  
                }
            }
        }
        return maxProfit; 
    }
}