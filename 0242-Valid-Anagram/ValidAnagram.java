/* https://leetcode.com/problems/valid-anagram/ */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] occorrenze = new int[26];

        // Carica le occorrenze di S nell'array
        for (int i = 0; i < s.length(); i++) {
            occorrenze[s.charAt(i) - 'a']++;
        }
        // Sarica l'arry di occorrenze di S. Se la cella corrispondente è già a 0, le occorrenze di S e T non coincidono
        for (int i = 0; i < t.length(); i++) {
            if (occorrenze[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            else {
                occorrenze[t.charAt(i) - 'a']--;    
            }
        }

        return true;
    }
}
