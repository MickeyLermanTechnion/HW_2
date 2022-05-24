public class ReversePolishNotationParser extends ExpressionParser{

    /**
     * split the string to get an array of String
     * initializing the stack so the first String in the array will be on the bottom of the stack
     * that way the stack will represent the Reverse Polish Notation method(right to left).
     * call the method createExpression to translate the contents of the Stack to an Expression
     * @param expression
     * @return Expression representing the String expression
     */
    public Expression parse(String expression) {
        this.expressions = new Stack<String>();
        String[] expArray = expression.split(" ");
        for (int i = 0; i < expArray.length; i++) {
            this.expressions.push(expArray[i]);
        }
        return createExpression();
    }

    /**
     * creates an Expression to represent y*x(Reverse Polish Notation method reads right to left)
     * @param x
     * @param y
     * @return Expression representing multiplication in the Reverse Polish Notation method
     */
    protected Expression callMultiplication(Expression x,Expression y){
        return new Multiplication(y,x);
    }

    /**
     * creates an Expression to represent y+x(Reverse Polish Notation method reads right to left)
     * @param x
     * @param y
     * @return Expression representing addition in the Reverse Polish Notation method
     */
    protected Expression callAddition(Expression x,Expression y){
        return new Addition(y,x);
    }

    /**
     * creates an Expression to represent y-x(Reverse Polish Notation method reads right to left)
     * @param x
     * @param y
     * @return Expression representing subtraction in the Reverse Polish Notation method
     */
    protected Expression callSubtraction(Expression x,Expression y){
        return new Subtraction(y,x);
    }

    /**
     * creates an Expression to represent y/x(Polish Notation method reads left to right)
     * @param x
     * @param y
     * @return Expression representing division in the Polish Notation method
     */
    protected Expression callDivision(Expression x,Expression y){
        return new Division(y,x);
    }

}
