public class Subtraction extends Expression{

    public Subtraction(Expression x, Expression y){
        super(x,y);
    }

    @Override
    public String toString(){
        return super.toString(this.expressions, '-');
    }
    @Override
    public double evaluate(){
        return this.expressions[0].evaluate() - this.expressions[1].evaluate();
    }
}
