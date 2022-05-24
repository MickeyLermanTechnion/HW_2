public class RoundedExpression extends Expression{

    /**
     * the RoundedExpression contains the expression x and its rounded Expression
     * @param x
     * @param numRound
     */
    public RoundedExpression(Expression x, int numRound) {
        this.expressions = new Expression[2];
        this.expressions[0] = getRoundVal(x, numRound);
        this.expressions[1] = x;
    }

    /**
     * private method to calculate the rounded value of the Expression
     * multiplies the value of x by 10^numRound and use the Math function round.
     * then divide by 10^numRound to get the rounded value
     * @param x
     * @param numRound
     * @return Expression representing x rounded to numRound places after the decimal dot.
     */
    private  Expression getRoundVal(Expression x, int numRound){
        double temp = x.evaluate();
        temp *= Math.pow(10,numRound);
        temp = Math.round(temp);
        return new DoubleLiteral(temp/Math.pow(10,numRound));
    }

    /**
     * @return the String representation of the original Expression(without changes)
     */
    @Override
    public String toString(){return expressions[1].toString();}

    /**
     * @return the value of the rounded Expression
     */
    @Override
    public double evaluate(){return expressions[0].evaluate();}
}
