public class MultiMultiplication extends Expression {

    //TODO: maybe give the multimultiplicatopn an array of multiplications
    // in case of an odd number of expressions the last will be in a multiplication with "null" as a sign to stop.


    private Expression[] expToMultiply;
    private int expLength;

    public MultiMultiplication(Expression... expressions){
        this.expToMultiply = expressions;
        this.expLength = expToMultiply.length;
    }

    public String toString(){
        String expString = "(" + expToMultiply[0]; //at least two expressions so 0 must exist
        for(int i=1; i<expLength; i++){
            expString += " * " + expToMultiply[i].toString();
        }
        return expString + ")";



        /*
        String expString = "";
        for(int i=1; i<expLength; i++){
            expString += super.toString();
        }

         */

    }
    public double evaluate(){
        double expValue = 0; //at least two expressions so 0 must exist
        for(int i=0; i<expLength; i++){
            expValue *= expToMultiply[i].evaluate();
        }
        return expValue;
    }
}
