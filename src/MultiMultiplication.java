public class MultiMultiplication extends Expression {

    public MultiMultiplication(Expression... expressions){super(expressions);}

    @Override
    public String toString(){
        return super.toString(expressions, '*');
    }
    public double evaluate(){
        double expValue = 0; //at least two expressions so 0 must exist
        for(int i=0; i<expLength; i++){
            expValue *= expressions[i].evaluate();
        }
        return expValue;
    }
}
