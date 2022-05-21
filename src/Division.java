public class Division  extends Expression{
    public Division(Expression x, Expression y){
        super(x,y);
    }

    public String toString(){
        return super.toString(this.expressions, '/');
    }
    public double evaluate(){
        return this.expressions[0].evaluate() / this.expressions[1].evaluate();
    } //CHANGED - WAS '-' INSTEAD OF '/'
}
