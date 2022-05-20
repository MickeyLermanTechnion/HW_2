public class Subtraction<X,Y> extends Expression{
    private Pair<Expression> exp;

    // TODO: CONSTRACTOR

    public Subtraction(Expression x, Expression y){

    }

    public String toString(){
        return "(" + exp.getFirst().toString() + "-" + exp.getSecond().toString() + ")";
    }
    public double evaluate(){
        return exp.getFirst().evaluate() - exp.getSecond().evaluate();
    }
}
