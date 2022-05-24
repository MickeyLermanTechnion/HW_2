    abstract public class Expression {
    protected Expression[] expressions;
    protected int expLength;

    public Expression(Expression... expressions){
        this.expressions = expressions;
        this.expLength = this.expressions.length;
    }

        /**
         * protected method, used by classes that extends Expression.
         * gets an array of operands and the connecting operator and returns the expression's string representation.
         * @param expressions
         * @param operator
         * @return expression's string representation.
         */
    protected String toString(Expression[] expressions,  char operator){
        String expString = "(" + expressions[0]; //at least two expressions so 0 must exist
        for(int i=1; i<expLength; i++){
            expString += " " + operator + " " + expressions[i].toString();
        }
        return expString + ")";
    }

        /**
         * every expression's string is composed of a series of smaller expressions with operators connecting them.
         * each implementation will generate a string representation of this build.
         * @return expression's string representation.
         */
    abstract public String toString();

        /**
         * each expression has a numeric value.
         * the implementations will calculate this value.
         * @return the numeric value of the expression.
         */
    abstract public double evaluate();
}
