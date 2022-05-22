public class RoundedExpression extends Expression{
    public RoundedExpression(Expression x, int numRound) {
        this.expressions = new Expression[2];
        this.expressions[0] = getRoundVal(x, numRound);
        this.expressions[1] = x;
    }
    private  Expression getRoundVal(Expression x, int numRound){
        double temp = x.evaluate();
        temp *= Math.pow(10,numRound);
        temp = Math.round(temp);
        return new DoubleLiteral(temp/Math.pow(10,numRound));
        /*
        //take string, split bt ".", keep only numRound numbers after , ".".join()
       String xString = x.toString();
       String[] xParts = xString.split(".");
       if (xParts.length == 1){return x;}//if x is int- no numbers after "." return x
       int numDigAfterDot = xParts[1].length()-numRound;
       xParts[1]=xParts[1].substring(0,numDigAfterDot);
       Double temp = Double.parseDouble(xParts[1]);

        return new DoubleLiteral(temp.doubleValue());
         */
    }
    //TODO
    @Override
    public String toString(){return expressions[1].toString();}
    public double evaluate(){return expressions[0].evaluate();}
}
