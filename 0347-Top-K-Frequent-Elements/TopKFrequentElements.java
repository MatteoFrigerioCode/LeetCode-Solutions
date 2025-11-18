/* https://leetcode.com/problems/top-k-frequent-elements/ */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] occorrenze = new List[nums.length + 1];

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int i = 0; i < occorrenze.length; i++) {
            occorrenze[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            occorrenze[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = occorrenze.length - 1; i > 0 && index < k; i--) {
            for (int n : occorrenze[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
