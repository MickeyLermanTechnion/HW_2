    abstract public class Expression {
    protected Expression[] expressions;
    protected int expLength;

    public Expression(Expression... expressions){
        this.expressions = expressions;
        this.expLength = this.expressions.length;
    }

        /**
         * every expression's string is composed of a series of smaller expressions with operators connecting them
         * gets an array of expressions and an operator to connect them with
         *
         * @param expressions
         * @param operator
         * @return expression's string
         */
    public String toString(Expression[] expressions,  char operator){
        String expString = "(" + expressions[0]; //at least two expressions so 0 must exist
        for(int i=1; i<expLength; i++){
            expString += operator + expressions[i].toString();
        }
        return expString + ")";
    }

    abstract public String toString();
    abstract public double evaluate();
}
