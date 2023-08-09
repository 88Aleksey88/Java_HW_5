import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public double getUserValue() {
        System.out.println("Введите число: ");
        return scanner.nextDouble();
    }

    public String getUserOperation() {
        System.out.println("Введите операцию: ");
        return scanner.next();
    }

}
