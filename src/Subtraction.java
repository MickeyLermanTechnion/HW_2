public class Subtraction extends Expression{
    private Pair<Expression> exp;
    public String toString(){
        return "(" + exp.getFirst().toString() + "-" + exp.getSecond().toString() + ")";
    }
    public double evaluate(){
        return exp.getFirst().evaluate() - exp.getSecond().evaluate();
    }
}
