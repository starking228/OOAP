package Module3;

// Клас віднімання
class SubtractExpression extends BinaryOperation {
    public SubtractExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
