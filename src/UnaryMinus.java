public class UnaryMinus extends Expression{

    public UnaryMinus(Expression x){
        super(x);
    }

    /**
     * adds () around the value and a '-' before the value of the Expression
     * @return String representation of the UnaryMinus Expression
     */
    @Override
    public String toString() {return "(-" + this.expressions[0].toString() + ")";}

    /**
     * multiply the Expression's value by -1 to get its negative value
     * @return the negative value of the Expression
     */
    @Override
    public double evaluate(){return (-1) * this.expressions[0].evaluate();}
}