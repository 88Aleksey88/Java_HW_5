public class CalculatorModel {
    Double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void sub(double num1, double num2) {
        result = num1 - num2;

    }

    public void mult(double num1, double num2) {
        result = num1 * num2;
    }

    public void div(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        }
        else {
            throw new IllegalArgumentException("На ноль делить нельзя!", null);
        }

    }

    public double getResult() {
        return result;
    }
}