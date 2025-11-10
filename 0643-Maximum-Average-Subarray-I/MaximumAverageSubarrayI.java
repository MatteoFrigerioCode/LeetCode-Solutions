/* https://leetcode.com/problems/maximum-average-subarray-i/ */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double somma = 0, maxSomma = Double.NEGATIVE_INFINITY;

       for (int i = 0, j= 0; i < nums.length; i++) {
            // Somma una sequenza di k numeri
            somma += nums[i];
            if ((i - j) == k) {
                somma -= nums[j];
                j++;
            }
            // Controlla la somma SSE ha visto almeno k elementi
            if (i >= (k - 1) && somma > maxSomma) {
                maxSomma = somma;
            }
        }
        return maxSomma / k;  
    }
}
