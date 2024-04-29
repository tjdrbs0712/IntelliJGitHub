package Cal;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{

    public CircleCalculator(ArrayList<Integer> resultList, ArrayList<Double> circleList){
        super(resultList,circleList);
    }

    @Override
    public double calculateCircleArea(int r){
        double area = r*r*PI;
        setCircleArea(area);
        setCircleList(getCircleArea());
        return area;
    }
}
