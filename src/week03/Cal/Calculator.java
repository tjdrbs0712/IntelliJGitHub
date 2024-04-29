package week03.Cal;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }
//    private AbstractOperation aOperation;
//
//    public Calculator(AbstractOperation aOperation){
//        this.aOperation = aOperation;
//    }
//
//    public void setaOperation(AbstractOperation aOperation){
//        this.aOperation = aOperation;
//    }
//
//   public double calculate(int f, int s){
//       return aOperation.operate(f, s);
//   }
}
