package Cal;

public class DivideOperator implements Operator {

    @Override
    public int operate(int f, int s) throws Exception{
        if(f==0){
            throw new Exception("분모가 0입니다.");
        }
        return f/s;
    }
}
