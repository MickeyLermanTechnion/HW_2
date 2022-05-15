public class Multiplication extends Expression{
    private Expression[] expToMultiply;
    public String toString(){
        return "(" + expToMultiply[0] + " * " + ")";
    }

    public double evaluate(){
        return super.evaluate();
    }
}
