/* https://leetcode.com/problems/valid-palindrome/submissions/1825186410/ */
class Solution {
    public boolean isPalindrome(String s) {   
        // Scorre la stringa ignorando i caratteri non alfanumerici
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if (Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
            else if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
        }

        return true;
    }
}
