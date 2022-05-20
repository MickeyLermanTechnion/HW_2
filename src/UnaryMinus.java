public class UnaryMinus extends Expression{
    public UnaryMinus(Expression x){
        super(x);
    }

    @Override
    public String toString() {return "(-" + this.expressions[0].toString() + ")";}
    @Override
    public double evaluate(){return (-1) * this.expressions[0].evaluate();}
}