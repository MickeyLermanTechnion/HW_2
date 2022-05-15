public class DoubleLiteral extends Expression{
    private Number value;

    public DoubleLiteral(Number value){this.value=value;}

    @Override
    public String toString(){
        return "(" + this.value.doubleValue() + ")";
    }

    @Override
    public double evaluate(){
        return this.value.doubleValue();
    }
}
