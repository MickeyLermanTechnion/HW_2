import java.util.Stack;

public class PolishNotationParser extends ExpressionParser {
    public Expression parse(String expression) {
        this.expressions = new Stack<String>();
        String[] expArray = expression.split(" ");
        for (int i = expArray.length-1; i >= 0; i--) {
            this.expressions.push(expArray[i]);
        }
        return createExpression();
    }
}
