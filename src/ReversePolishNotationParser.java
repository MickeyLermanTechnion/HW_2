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
        return new Multiplication(y,x);
    }
    protected Expression callAddition(Expression x,Expression y){
        return new Addition(y,x);
    }
    protected Expression callSubtraction(Expression x,Expression y){
        return new Subtraction(y,x);
    }
    protected Expression callDivision(Expression x,Expression y){
        return new Division(y,x);
    }

}
