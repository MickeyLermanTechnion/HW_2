    abstract public class Expression {
    protected Expression[] expressions;
    protected int expLength;

    public Expression(Expression... expressions){
        this.expressions = expressions;
        this.expLength = this.expressions.length;
    }

    abstract public String toString();

    public String toString(Expression[] expressions,  char operator){
        String expString = "(" + expressions[0]; //at least two expressions so 0 must exist
        for(int i=1; i<expLength; i++){
            expString += operator + expressions[i].toString();
        }
        return expString + ")";
    }
    abstract public double evaluate();
}
