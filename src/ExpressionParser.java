import java.util.Stack;

abstract public class ExpressionParser {
    protected Stack<String> expressions;// that way we can read the notations value by value.
    // Polish - entering the values from left to right
    // Reverse Polish - entering the values from right to left
    // we can use switch command to activate different expressions constructors
    // TODO: create a number expression which will call integer literal if int and double literal if double
    //change

    public static Expression numberExpression(String num)
    {
        if(num.contains(".")){return new DoubleLiteral(Double.parseDouble(num));}
        return new IntegerLiteral(Integer.parseInt(num));
    }
    abstract Expression parse(String expression);
    abstract Expression callMultiplication(Expression x, Expression y);
    abstract Expression callAddition(Expression x, Expression y);
    abstract Expression callSubtraction(Expression x, Expression y);
    abstract Expression callDivision(Expression x, Expression y);

    public Expression createExpression(){
        String value = this.expressions.pop();
        Expression x;
        Expression y;
        switch(value){
            case "*":
                x = createExpression();
                y = createExpression();
                return callMultiplication(x,y);
            case "+":
                x = createExpression();
                y = createExpression();
                return callAddition(x,y);
            case "/":
                x = createExpression();
                y = createExpression();
                return callDivision(x,y);
            case "-":
                x = createExpression();
                y = createExpression();
                return callSubtraction(x,y);
            case "-u":
                x = createExpression();
                return new UnaryMinus(x);
            default:
                return numberExpression(value);
        }

    }
}
