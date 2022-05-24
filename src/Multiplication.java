public class Multiplication extends MultiMultiplication{

    /**
     * represents x*y
     * @param x
     * @param y
     */
    public Multiplication(Expression x, Expression y){
        super(x,y);
    }

    /**
     * using the super method we can get the representation of a multimultiplication with 2 operands
     * @return string the represents the multiplication expression
     */
    @Override
    public String toString(){
        return super.toString();
    }

    /**
     * using the super method we can calculate a multimultiplication with 2 operands
     * @return the numeric value of the multiply expression
     */
    @Override
    public double evaluate(){
        return super.evaluate();
    }
}
