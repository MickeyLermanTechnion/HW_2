public class IntegerLiteral  extends Expression{
    private Number value;

    public IntegerLiteral(Number value, Expression... expression) {
        super(expression);
        this.value = value;
    }

    public Number getValue() {return value;}
    public void setValue(Number value) {this.value = value;}

    @Override
    public String toString(){
        return  "("+value.intValue()+")";
    }
    @Override
    public double evaluate(){
        return value.doubleValue();
    }
}
