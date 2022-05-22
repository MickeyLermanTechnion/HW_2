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
}
