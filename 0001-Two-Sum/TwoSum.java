/* https://leetcode.com/problems/two-sum/ */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] indiciAddendi = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            // Cerca un numero x affinché curr + x = target
            int x = target - curr;
            // Controlla se è già stato incontrato e quindi salvato nella mappa
            if (map.containsKey(x)) {
                indiciAddendi[0] = map.get(x);
                indiciAddendi[1] = i;
                return indiciAddendi;
            }
            map.put(curr, i);
        }
        return null;
    }
}
