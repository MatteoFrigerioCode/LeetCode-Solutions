https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        // Crea una nuova pila in cui salva ogni carattere
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            // Primo elemento della stringa
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                pila.push(s.charAt(i));
            }

            // È un elemento di chiusura ma non ci sono parentesi aperte
            else if (pila.empty()) {
                return false;
            }

            // È un elemento di chiusura e c'é almeno una parentesi aperta
            else {
                char topStack = pila.pop();

                // Controlla che le parentesi matchino nella maniera corretta
                if (s.charAt(i) == ')' && topStack != '(' || s.charAt(i) == ']' && topStack != '[' || s.charAt(i) == '}' && topStack != '{') {
                    return false;
                }
            }
        }
        // Controlla che la pila sia vuota
       return pila.empty();
    }
}
