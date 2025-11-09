/* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/ */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while(i < j) {
            int somma = numbers[i] + numbers[j];
            if (somma == target) {
                return new int[] {i + 1, j + 1};
            }
            else if (somma < target) {
                i++;
            }
            else {
                j--;
            }
        }

        return null;
    }
}
