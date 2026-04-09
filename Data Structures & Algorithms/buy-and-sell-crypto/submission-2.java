class Solution {
    public int maxProfit(int[] prices) {
        int minPriceSoFar = prices[0]; 
        int maxProfit = 0; 

        for (int price : prices) {
            if (price < minPriceSoFar) {
                minPriceSoFar = price; 
            } else {
                int difference = price - minPriceSoFar;
                if (difference > maxProfit) {
                    maxProfit = difference; 
                }
            }
        }
        return maxProfit; 
    }
}
