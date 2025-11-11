/* https://leetcode.com/problems/container-with-most-water/ */
class Solution {
    public int maxArea(int[] height) {
        int area = 0, areaMax = 0, i = 0, j = height.length - 1;
        while (i < j) {
            area = Math.min(height[i], height[j]) * (j - i);
            if (area > areaMax) {
                areaMax = area;
            }
            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return areaMax;   
    }
}
