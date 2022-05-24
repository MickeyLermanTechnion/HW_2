//import java.util.Stack;

abstract public class ExpressionParser {
    protected Stack<String> expressions;// that way we can read the notations value by value.
    // Polish - entering the values from left to right
    // Reverse Polish - entering the values from right to left

    /**
     * private method to assist the method createExpression
     * based on the appearance of "." will determine if the string is double or integer
     * will create a new expression based on that:
     * DoubleLiteral if double and IntegerLiteral if integer
     * @param num
     * @return Expression representing num
     */
    private static Expression numberExpression(String num)
    {
        if(num.contains(".")){return new DoubleLiteral(Double.parseDouble(num));}
        return new IntegerLiteral(Integer.parseInt(num));
    }

    /**
     * the implementations will translate the String into Expression
     * @param expression
     * @return Expression representing expression
     */
    abstract Expression parse(String expression);

    /**
     * the implementations will create a Multiplication expression
     * @param x
     * @param y
     * @return Expression representing the multiplication of x and y
     */
    abstract Expression callMultiplication(Expression x, Expression y);

    /**
     * the implementations will create an Addition expression
     * @param x
     * @param y
     * @return Expression representing the addition of x and y
     */
    abstract Expression callAddition(Expression x, Expression y);

    /**
     * the implementations will create a Subtraction expression
     * @param x
     * @param y
     * @return Expression representing the subtraction of x and y
     */
    abstract Expression callSubtraction(Expression x, Expression y);

    /**
     * the implementations will create a Division expression
     * @param x
     * @param y
     * @return Expression representing the division of x and y
     */
    abstract Expression callDivision(Expression x, Expression y);

    /**
     * using the Stack of strings will run the translation to Expression process.
     * will recursively go over all the values of the stack to generate the final
     * Expression from a combination of smaller ones.
     * pop the top value in the stack and based on its value call helper methods:
     * operator "*" - add Multiplication containing the next two Expressions in the Stack
     * operator "+" - add Addition containing the next two Expressions in the Stack
     * operator "-" - add Subtraction containing the next two Expressions in the Stack
     * operator "/" - add Division containing the next two Expressions in the Stack
     * operand - add Expression containing this value
     * @return the final Expression
     */
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
