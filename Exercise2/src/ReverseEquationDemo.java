/**
 * ReverseEquationDemo.java
 * Your Name:        Mehmet Uryan
 * Your Student ID:  240446021
 * Your Date:        2026.10.26
 */

public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "5+2*56-2/4",
                "123+45*6",
                "100/25-7"
        };

        //Print the input and output like in the expected output
        for (String equation : equations) {
            System.out.println("Input:  " + equation);
            System.out.println("Output: " + EquationReverser.reverseEquation(equation));
            System.out.println();
        }
    }
}