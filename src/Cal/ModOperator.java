package Cal;

public class ModOperator implements Operator {

    @Override
    public int operate(int f, int s){
        return f % s;
    }
}
