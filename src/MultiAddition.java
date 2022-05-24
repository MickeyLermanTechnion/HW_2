public class MultiAddition extends Expression{

    public MultiAddition(Expression ... expressions) {super(expressions);}

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
