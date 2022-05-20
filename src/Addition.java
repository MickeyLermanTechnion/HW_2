public class Addition extends MultiAddition{
    /**
          * represents x*y
          * @param x
          * @param y
         */
    public Addition(Expression x, Expression y) {super(x,y);}
    public String toString(){return super.toString();}
    public double evaluate(){return super.evaluate();}
}
