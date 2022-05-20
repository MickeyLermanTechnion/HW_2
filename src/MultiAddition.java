public class MultiAddition extends Expression{

    public MultiAddition(Expression... expressions) {super(expressions);}

    @Override
    public String toString(){
        return super.toString(expressions, '+');
    }

    @Override
    public double evaluate(){
        double  expVal = 0; //at least two expressions so 0 must exist
        for (int i=0; i<expLength; i++){
            expVal += expressions[i].evaluate();
        }
        return expVal;
    }
}
