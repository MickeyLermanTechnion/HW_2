public class MultiMultiplication extends Expression {

    public MultiMultiplication(Expression... expressions){super(expressions);}

    @Override
    public String toString(){
        return super.toString(expressions, '*');
    }

    @Override
    public double evaluate(){
        double expValue = this.expressions[0].evaluate(); //at least two expressions so 0 must exist
        for(int i=1; i<expLength; i++){
            expValue *= expressions[i].evaluate();
        }
        return expValue;
    }
}
