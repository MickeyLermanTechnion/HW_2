abstract public class Expression {
    private Expression[] expressions;

    public Expression(Expression... expression){
        this.expressions = expression;
    }

    abstract public String toString();
    abstract public double evaluate();
}
