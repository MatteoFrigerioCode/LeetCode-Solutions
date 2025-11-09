/* https://leetcode.com/problems/contains-duplicate/description/ */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            // Se l'add restituisce false, l'elemento è già presente
            if (set.add(nums[i]) == false) {
                return true;
            }
        }
        // Nessun duplicato presente
        return false; 
    }
}
