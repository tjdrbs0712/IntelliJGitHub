package Cal;

import java.util.*;

public class App {

    static Calculator cal1 = new CircleCalculator(new ArrayList<>(), new ArrayList<>());
    static Calculator cal2 = new ArithmeticCalculator(new ArrayList<>(), new ArrayList<>());
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("1.사칙연산, 2.원의 넓이");
                int select = sc.nextInt();

                switch(select){
                    case 1 -> ArithmeticOperation();
                    case 2 -> calculateCircleArea();
                }

                if(!continueCalculate()) break;

            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

    public static void ArithmeticOperation() throws Exception{

        int firstNumber = getIntInput("첫 번째 숫자를 입력하세요: ");
        int secondNumber = getIntInput("두 번째 숫자를 입력하세요: ");
        char operator = getCharInput("사칙연산 기호를 입력하세요: ");
        //계산
        cal2.calculate(firstNumber, secondNumber, operator);
        System.out.println("결과: " + cal2.getResult());

        manage();
    }

    public static void manage() throws Exception{
        //계산 결과 삭제
        sc.nextLine();
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String re = sc.nextLine();
        if (re.equals("remove")) {
            cal2.removeResult();
        }

        //계산 결과 조회
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String in = sc.nextLine();
        if (in.equals("inquiry")) {
            cal2.inquiryResult();
        }
    }

    public static void calculateCircleArea(){
        int r = getIntInput("반지름: ");
        double circleArea = cal1.calculateCircleArea(r);
        System.out.println("원의 넓이: " + String.format("%.1f", circleArea));

        System.out.println("저장된 원의 넓이");
        ArrayList<Double> circleList = cal1.getCircleList();
        for(Double v : circleList){
            System.out.println(String.format("%.1f", v));
        }
        sc.nextLine();
    }

    public static boolean continueCalculate(){
        //계속 계산
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        String ex = sc.nextLine();
        if (ex.equals("exit")) {
            return false;
        }
        return true;
    }

    public static int getIntInput(String m){
        System.out.print(m);
        return sc.nextInt();
    }

    public static char getCharInput(String m){
        System.out.println(m);
        return sc.next().charAt(0);
    }

}
