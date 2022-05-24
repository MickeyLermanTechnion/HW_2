public class MultiAddition extends Expression{

    /**
     * making sure we get at least two Expressions for the multiaddition
     * demand two Expressions and an array of more Expressions(if needed)
     * initialize this.expressions to be an array containing expression1, expression2 and expressions
     * @param expression1
     * @param expressions
     */
    public MultiAddition(Expression expression1, Expression expression2, Expression... expressions){
        Expression[] expressionArray = new Expression[expressions.length+2];
        expressionArray[0] = expression1;
        expressionArray[1] = expression2;
        for(int i=2;i<expressionArray.length;i++){expressionArray[i] = expressions[i-2];}
        this.expressions = expressionArray;
        this.expLength = expressionArray.length;
    }

    /**
     * connects all the operators with a "+" operand to represent addition
     * @return string the represents the addition expression
     */
    @Override
    public String toString(){
        return super.toString(expressions, '+');
    }

    /**
     * adds up all the operands in the expression
     * @return the numeric value of the addition expression
     */
    @Override
    public double evaluate(){
        double  expVal = 0; //at least two expressions so 0 must exist
        for (int i=0; i<expLength; i++){
            expVal += expressions[i].evaluate();
        }
        return expVal;
    }
}
