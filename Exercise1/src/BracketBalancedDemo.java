/**
 * BracketBalancedDemo.java
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        2026.10.26
 */

public class BracketBalancedDemo {

    public static void main(String[] args) {

        String[] expressions = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };

        System.out.println("========== BALANCED BRACKET TEST ==========");

        for (String expression : expressions) {

            boolean result = BalancedBrackets.isBalanced(expression);

            System.out.println("Input: " + expression + " -> Output: " + result);
        }
    }
}