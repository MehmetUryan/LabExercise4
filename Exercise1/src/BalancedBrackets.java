/**
 * BalancedBrackets.java
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        2026.10.26
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        // 1. Traverse the string character by character.
        // 2. If the character is an opening bracket,
        //    push it onto the stack.
        // 3. If it is a closing bracket:
        //      - Check whether the stack is empty.
        //      - Pop the top opening bracket.
        //      - Check whether the brackets match.(call isMatchingPair method)
        // 4. At the end, check whether the stack is empty.

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if (!isMatchingPair(opening, current)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {

        // Check: ( matches )
        if (opening == '(' && closing == ')') {
            return true;
        }

        // Check: [ matches ]
        if (opening == '[' && closing == ']') {
            return true;
        }

        // Check: { matches }
        if (opening == '{' && closing == '}') {
            return true;
        }

        // if check doesnt match; then return false
        return false;
    }
}