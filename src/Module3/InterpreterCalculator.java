package Module3;

import java.util.*;

// Головний клас
public class InterpreterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input \'Exit\' to stop program");

        while (true) {
            System.out.println("Input expression (example: 5 + 3 - 2):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            try {
                Expression expression = ExpressionParser.parse(input);
                int result = expression.interpret();
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Expression error!");
            }
        }
    }
}
