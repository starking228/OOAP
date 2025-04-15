package Module3;

import java.util.Stack;

// Парсер виразів
class ExpressionParser {
    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.trim().split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+")) {
                Expression left = stack.pop();
                Expression right = new NumberExpression(Integer.parseInt(tokens[++i]));
                stack.push(new AddExpression(left, right));
            } else if (token.equals("-")) {
                Expression left = stack.pop();
                Expression right = new NumberExpression(Integer.parseInt(tokens[++i]));
                stack.push(new SubtractExpression(left, right));
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }

        return stack.pop();
    }
}
