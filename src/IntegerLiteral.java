public class IntegerLiteral  extends Expression{
    private Number value;

    public Number getValue() {return value;}
    public void setValue(Number value) {this.value = value;}

    @Override
    public String toString(){
        return value.toString();
    }
    @Override
    public double evaluate(){
        return value.doubleValue();
    }
}
