package Cal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator{

    private Map<Character, Operator> operators = new HashMap<>();
    Operator operator;

    public ArithmeticCalculator(ArrayList<Integer> resultList, ArrayList<Double> circleList){
        super(resultList,circleList);
        Operators();
    }

    @Override
    public void calculate(int f, int s, char o) throws Exception{
        result = getOperator(o).operate(f, s);
        setResult(result);
        setResultList(getResult());
    }

    private Operator getOperator(char o) throws Exception{
        operator = operators.get(o);
        if(operator == null){
            throw new Exception("연산자를 잘못 입력하셨습니다.");
        }
        return operator;
    }

    private void Operators(){
        operators.put('+', new AddOperator());
        operators.put('-', new SubstractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }

}

