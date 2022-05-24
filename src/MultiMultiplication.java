public class MultiMultiplication extends Expression {

    public MultiMultiplication(Expression... expressions){super(expressions);}

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
