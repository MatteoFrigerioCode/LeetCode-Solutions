/* https://leetcode.com/problems/longest-substring-without-repeating-characters/ */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> caratteri = new HashSet<>();
        int maxLen = 0;
        int i = 0, j = 0;
        while (i < s.length()) {
            // Duplicato trovato
            if (caratteri.contains(s.charAt(i))) {

                // Toglie tutti i caratteri fino ad arrivare al duplicato
                while (s.charAt(j) != s.charAt(i)) {
                    caratteri.remove(s.charAt(j));
                    j++;
                }
                // Rimuove il duplicato
                caratteri.remove(s.charAt(j));
                j++;
            }
            else {
                caratteri.add(s.charAt(i));
                i++;
            }
            // Salva la nuova lunghezza se questa è massima
            if (caratteri.size() > maxLen) {
                maxLen = caratteri.size();
            }
        }

        return maxLen;
    }
}
