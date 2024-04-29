package week03.Cal;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public void parseFirstNum(String firstInput) throws Exception{
        if(!Pattern.matches(NUMBER_REG, firstInput)){
            throw new BadInputException("정수값");
        }
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));
        //return this;
    }

    public void parseSecondNum(String secondInput) throws Exception{
        if(!Pattern.matches(NUMBER_REG, secondInput)){
            throw new BadInputException("정수값");
        }
        this.calculator.setSecondNumber(Integer.parseInt(secondInput));
        //return this;
    }

    public void parseOperator(String operationInput) throws Exception{
        if(!Pattern.matches(OPERATION_REG, operationInput)){
            throw new BadInputException("연산자");
        }

        switch (operationInput){
            case "+" -> calculator.setOperation(new addOperation());
            case "-" -> calculator.setOperation(new substractOperation());
            case "*" -> calculator.setOperation(new multiplyOperation());
            case "/" -> calculator.setOperation(new divideOperation());
        }

        //return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
