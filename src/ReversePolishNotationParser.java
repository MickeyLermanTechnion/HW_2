import java.util.Stack;

public class ReversePolishNotationParser extends ExpressionParser{

    public Expression parse(String expression) {
        this.expressions = new Stack<String>();
        String[] expArray = expression.split(" ");
        for (int i = 0; i < expArray.length; i++) {
            this.expressions.push(expArray[i]);
        }
        return createExpression();
    }
    protected Expression callMultiplication(Expression x,Expression y){
        return new Multiplication(x,y);
    }
    protected Expression callAddition(Expression x,Expression y){
        return new Addition(x,y);
    }
    protected Expression callSubtraction(Expression x,Expression y){
        return new Subtraction(x,y);
    }
    protected Expression callDivision(Expression x,Expression y){
        return new Division(x,y);
    }

}
