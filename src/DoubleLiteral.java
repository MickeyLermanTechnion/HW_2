public class DoubleLiteral extends Expression{
    private Number value;

    public DoubleLiteral(Number value){this.value=value;}

    /**
     * adds () around the value to represent it as an Expression
     * @return String representation of the Expression containing value
     */
    @Override
    public String toString(){
        return "(" + this.value.doubleValue() + ")";
    }

    /**
     * @return the numeric value of "value" in double
     */
    @Override
    public double evaluate(){
        return this.value.doubleValue();
    }
}
