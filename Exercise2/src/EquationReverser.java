/**
 * EquationReverser.java
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        2026.10.26
 */

public class EquationReverser {

    public static String reverseEquation(String equation) { // why the method is static?

        // create the object of the TokenStack class
        TokenStack stack = new TokenStack();

        int i = 0;

        // Push numbers and operators onto the stack.

        // Remember the beginning of the number and Move forward until the number ends.
        // Push the whole number as one item.

        while (i < equation.length()) {
            char current = equation.charAt(i);

            if (Character.isDigit(current)) {
                int start = i;

                while (i < equation.length()
                        && Character.isDigit(equation.charAt(i))) {
                    i++;
                }

                stack.push(equation.substring(start, i));
            } else {
                stack.push(String.valueOf(current));
                i++;
            }
        }

        // them to a StringBuilder. (Pop items to construct the reversed equation.)
        //String Builder= new StringBuilder() creates an empty builder. Each append() adds a character to it.

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}