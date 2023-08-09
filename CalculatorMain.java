public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter controller = new CalculatorPresenter(model, view);

        controller.onAddButtonClicked();
    }
}
