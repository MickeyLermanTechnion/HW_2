public class Subtraction extends Expression{

    /**
     * represents x-y
     * @param x
     * @param y
     */
    public Subtraction(Expression x, Expression y){
        super(x,y);
    }

    /**
     * using the super method we can get the representation of a subtraction with 2 operands
     * @return string the represents the subtraction expression
     */
    @Override
    public String toString(){
        return super.toString(this.expressions, '-');
    }

    /**
     * using the super method we can calculate a subtraction of 2 operands
     * @return the numeric value of the subtraction expression
     */
    @Override
    public double evaluate(){
        return this.expressions[0].evaluate() - this.expressions[1].evaluate();
    }
}
