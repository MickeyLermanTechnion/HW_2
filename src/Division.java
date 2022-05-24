public class Division  extends Expression{

    /**
     * represents x/y
     * @param x
     * @param y
     */
    public Division(Expression x, Expression y){
        super(x,y);
    }

    /**
     * using the super method we can get the representation of a division with 2 operands
     * @return string the represents the division expression
     */
    public String toString(){
        return super.toString(this.expressions, '/');
    }

    /**
     * using the super method we can calculate a division of 2 operands
     * @return the numeric value of the division expression
     */
    public double evaluate(){
        return this.expressions[0].evaluate() / this.expressions[1].evaluate();
    }
}
