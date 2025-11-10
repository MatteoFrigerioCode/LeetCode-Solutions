/* https://leetcode.com/problems/minimum-size-subarray-sum/ */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, minLen = 0, somma = 0;

        while (i < nums.length) {
            somma += nums[i];
            // Nuova somma valida trovata
            while (somma >= target) {
                // Nuova lunghezza minima
                if (minLen == 0 || i - j < minLen) {
                    minLen = i - j + 1;
                }
                // Minor lunghezza possibile trovata
                if (minLen == 1) {
                    return 1;
                }
                // Restringe la finestra
                somma -= nums[j];
                j++;
            }

            i++;
        }

        return minLen;
    }
}
