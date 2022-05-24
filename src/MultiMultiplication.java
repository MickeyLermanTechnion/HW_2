public class MultiMultiplication extends Expression {

    /**
     * making sure we get at least two Expressions for the multimultiplication
     * demand two Expressions and an array of more Expressions(if needed)
     * initialize this.expressions to be an array containing expression1, expression2 and expressions
     * @param expression1
     * @param expressions
     */
    public MultiMultiplication(Expression expression1, Expression expression2, Expression... expressions){
        Expression[] expressionArray = new Expression[expressions.length+2];
        expressionArray[0] = expression1;
        expressionArray[1] = expression2;
        for(int i=2;i<expressionArray.length;i++){expressionArray[i] = expressions[i-2];}
        this.expressions = expressionArray;
        this.expLength = expressionArray.length;
    }

    /**
     * connects all the operators with a "*" operand to represent multiplication
     * @return string the represents the multiplication expression
     */
    @Override
    public String toString(){
        return super.toString(expressions, '*');
    }

    /**
     * multiplies all the operands in the expression
     * @return the numeric value of the multiply expression
     */
    @Override
    public double evaluate(){
        double expValue = this.expressions[0].evaluate(); //at least two expressions so 0 must exist
        for(int i=1; i<expLength; i++){
            expValue *= expressions[i].evaluate();
        }
        return expValue;
    }
}
