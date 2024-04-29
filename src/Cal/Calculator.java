package Cal;

import java.util.*;

public abstract class Calculator {
    protected ArrayList<Integer> resultList;
    protected int result;

    protected ArrayList<Double> circleList;
    final static double PI = Math.PI; // 절대로 변하지 않는 파이를 모든 인스턴스에게 공유하기 위해서 final static 사용
    protected double circleArea;

    public Calculator(ArrayList<Integer> resultList, ArrayList<Double> circleList) {
        this.resultList = resultList; // 결과 값 리스트 초기화
        this.circleList = circleList; // 원이 넓이 값 리스트 초기화
    }

    //사칙연산 결과 값 가져오기
    public int getResult() {
        return this.result;
    }
    //사칙연산 결과 값 입력
    public void setResult(int result) {
        this.result = result;
    }
    //사칙연산 결과 값 리스트 가져오기
    public ArrayList<Integer> getResultList() {
        return this.resultList;
    }
    //사칙연산 결과 값 리스트에 추가하기
    public void setResultList(int result) {
        this.resultList.add(result);
    }
    //원의 넓이 가져오기
    public double getCircleArea(){
        return this.circleArea;
    }
    //원의 넓이 입력
    public void setCircleArea(double circleArea){
        this.circleArea = circleArea;
    }
    //원의 넓이 리스트 가져오기
    public ArrayList<Double> getCircleList(){
        return this.circleList;
    }
    //원의 넓이 추가하기
    public void setCircleList(double circleArea){
        this.circleList.add(circleArea);
    }
    //사칙연산 값 지우기
    public void removeResult(){
        resultList.remove(0);
    }
    //사칙연산 값 전체 출력
    public void inquiryResult(){
        System.out.println(resultList.toString());
    }

    public double calculateCircleArea(int r){
        return 0;
    }

    public void calculate(int f, int s, char o) throws Exception{ }

}
