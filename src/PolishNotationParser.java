public class PolishNotationParser extends ExpressionParser {

    /**
     * split the string to get an array of String
     * initializing the stack so the first String in the array will be on top of the stack
     * that way the stack will represent the Polish Notation method(left to right).
     * call the method createExpression to translate the contents of the Stack to an Expression
     * @param expression
     * @return Expression representing the String expression
     */
    public Expression parse(String expression) {
        this.expressions = new Stack<String>();
        String[] expArray = expression.split(" ");
        for (int i = expArray.length-1; i >= 0; i--) {
            this.expressions.push(expArray[i]);
        }
        return createExpression();
    }

    /**
     * creates an Expression to represent x*y(Polish Notation method reads left to right)
     * @param x
     * @param y
     * @return Expression representing multiplication in the Polish Notation method
     */
    protected Expression callMultiplication(Expression x,Expression y){
       return new Multiplication(x,y);
    }

    /**
     * creates an Expression to represent x+y(Polish Notation method reads left to right)
     * @param x
     * @param y
     * @return Expression representing addition in the Polish Notation method
     */
    protected Expression callAddition(Expression x,Expression y){
        return new Addition(x,y);
    }

    /**
     * creates an Expression to represent x-y(Polish Notation method reads left to right)
     * @param x
     * @param y
     * @return Expression representing subtraction in the Polish Notation method
     */
    protected Expression callSubtraction(Expression x,Expression y){
        return new Subtraction(x,y);
    }

    /**
     * creates an Expression to represent x/y(Polish Notation method reads left to right)
     * @param x
     * @param y
     * @return Expression representing division in the Polish Notation method
     */
    protected Expression callDivision(Expression x,Expression y){
        return new Division(x,y);
    }

}
