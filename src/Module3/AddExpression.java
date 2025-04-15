package Module3;

// Клас додавання
class AddExpression extends BinaryOperation {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
