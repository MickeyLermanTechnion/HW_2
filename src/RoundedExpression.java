public class RoundedExpression extends Expression{
    private int numRound;
    public RoundedExpression(Expression x, int numRound) {
        super(x);
        this.numRound =numRound;
    }
    private  Expression getRoundVal(Expression x, int numRound){
        //take string, split bt ".", keep only numRound numbers after , ".".join()
       String xString = x.toString();
       String[] xParts = xString.split(".");
       if (xParts.length == 1){return x;}//if x is int- no numbers after "." return x
       int numDigAfterDot = xParts[1].length()-numRound;
       xParts[1]=xParts[1].substring(0,numDigAfterDot);
       Double temp = Double.parseDouble(xParts[1]);

        return new DoubleLiteral(temp.doubleValue());
    }
    //TODO
    @Override
    public String toString(){}
    public double evaluate(){}
}
