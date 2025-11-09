/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */
class Solution {
    public int maxProfit(int[] prices) {
        int profittoMax = 0, prezzoMin = prices[0];
        for (int i = 0; i < prices.length; i++) {

            // Setta il prezzoMin al nuovo minimo incontrato
            if (prices[i] < prezzoMin) {
                prezzoMin = prices[i];
            }

            // Nuovo profittoMax trovato
            else if ((prices[i] - prezzoMin) > profittoMax) {
                profittoMax = prices[i] - prezzoMin;
            }
        }

        return profittoMax;
    }
}
