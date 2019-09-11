public class Calculator {

    public static final char ADDITION = '+';

    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char  DIVISION = '/';

    public static int calculate(int firstOpearand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOpearand + secondOperand;
            case SUBTRACTION:
                return firstOpearand - secondOperand;
            case MULTIPLICATION:
                return firstOpearand * secondOperand;
            case  DIVISION:
                if (secondOperand != 0)
                    return firstOpearand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}