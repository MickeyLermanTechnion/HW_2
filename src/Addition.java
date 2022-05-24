public class Addition extends MultiAddition{

    /**
     * represents x+y
     * @param x
     * @param y
     */
    public Addition(Expression x, Expression y) {super(x,y);}

    /**
     * using the super method we can get the representation of an addition with 2 operands
     * @return string the represents the addition expression
     */
    public String toString(){return super.toString();}

    /**
     * using the super method we can calculate an addition of 2 operands
     * @return the numeric value of the addition expression
     */
    public double evaluate(){return super.evaluate();}
}
