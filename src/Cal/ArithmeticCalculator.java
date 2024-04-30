package Cal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator{

    private final Map<Character, Operator> operators = new HashMap<>();
    Operator operator;

    public ArithmeticCalculator(ArrayList<Integer> resultList, ArrayList<Double> circleList){
        super(resultList,circleList);
        Operators();
    }

    //App.java에서 입력한 숫자와 연산자를 받아와 계산하는 메서드
    @Override
    public void calculate(int f, int s, char o) throws Exception{
        result = operators.get(OperatorType.enumOperator(o)).operate(f, s);
        setResult(result);
        setResultList(getResult());
    }

//    // 연산자에 맞는 계산 클래스를 가져오는 메서드
//    private Operator getOperator(char o) throws Exception{
//        operator = operators.get(o);
////        if(operator == null){
////            throw new Exception("연산자를 잘못 입력하셨습니다.");
////        }
//        return operator;
//    }

    //연산 클래스들을 초기화 시켜주는 메서드
    private void Operators(){
        operators.put('+', new AddOperator());
        operators.put('-', new SubstractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }

}


