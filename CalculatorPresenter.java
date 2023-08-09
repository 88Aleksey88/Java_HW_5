public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }
    public void onAddButtonClicked(){
        double num1 = view.getUserValue();
        double num2 = view.getUserValue();
        String operation = view.getUserOperation();
        switch(operation){
            case "+":
                model.add(num1, num2);
                break;
            case "-":
                model.sub(num1, num2);
                break;
            case "*":
                model.mult(num1, num2);
                break;
            case "/":
                model.div(num1, num2);
                break;
            default: System.out.println("Вы ввели некорректный символ!");
        }
        double result = model.getResult();
        view.displayResult(result);
    }
}
