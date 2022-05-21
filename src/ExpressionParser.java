abstract public class ExpressionParser {
    private Expression[] expressionsStack; // that way we can read the notations value by value.
    // Polish - entering the values from left to right
    // Reverse Polish - entering the values from right to left
    // we can use switch command to activate different expressions constructors
    // TODO: create a number expression which will call integer literal if int and double literal if double

    abstract Expression parse(String expression);
}
