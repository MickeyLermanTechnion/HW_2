public class IntegerLiteral  extends Expression{
    private Number value;

    public IntegerLiteral(Number value) {
        this.value = value;
    }

    /**
     * adds () around the value to represent it as an Expression
     * @return String representation of the Expression containing value
     */
    @Override
    public String toString(){
        return  "("+value.intValue()+")";
    }

    /**
     * @return the numeric value of "value" in int
     */
    @Override
    public double evaluate(){
        return value.intValue();
    }
}
