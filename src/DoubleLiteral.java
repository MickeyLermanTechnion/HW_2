public class DoubleLiteral extends Expression{
    private Number value;

    public DoubleLiteral(Number value){this.value=value;}

    public String toString(){
        return this.value.toString();
    }
    public double evaluate(){
        return this.value.doubleValue();
    }
}
