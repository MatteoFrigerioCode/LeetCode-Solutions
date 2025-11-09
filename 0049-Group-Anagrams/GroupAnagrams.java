/* https://leetcode.com/problems/group-anagrams/submissions/1825440637/ */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<List<String>> anagrammi = new ArrayList<List<String>>();

        // Scorre tutte le stringhe, le smonta in array di Char e le rimonta in stringhe ordinate lessicograficamente
        for (int i = 0; i < strs.length; i++) {
            char[] stringToCharArray = strs[i].toCharArray();
            Arrays.sort(stringToCharArray);
            String stringaOrdinata = String.valueOf(stringToCharArray);

            // Accede all'elenco di elementi mappati da questa stringa ordinata e aggiunge la stringa di partenza
            if (map.containsKey(stringaOrdinata)) {
                map.get(stringaOrdinata).add(strs[i]);
            }
            else {
                // Crea una nuova lista e una nuova mappatura per la chiave corrente e le salva nella mappa
                ArrayList<String> gruppo = new ArrayList<String>();
                gruppo.add(strs[i]);
                map.put(stringaOrdinata, gruppo);
            }
        }

        for (String current : map.keySet()) {
            anagrammi.add(map.get(current));
        }

        return anagrammi;     
    }
}
