public class MultiAddition extends Expression{
    private Expression[] expression;

    public MultiAddition(Expression[] expression1, Expression... expression) {
        super(expression);
        this.expression = expression1;
    }

    @Override
    public String toString(){
        String expressionString= "(";
        for (int i=0; i< expression.length;i++){
            expressionString += (expression[i].toString()+" + "+expression[i+1].toString()+" + ");
        }
        return  expressionString += ")";
    }

    @Override
    public double evaluate(){
        double  expressionVal = 0;
        for (int i=0; i<expression.length; i++){
            expressionVal += expression[i].evaluate();
        }
        return expressionVal;
    }

}
