package week03.CarSample;

public class Car {
    String company; //자동차 회사
    String model = "Gv80"; //자동차 모델
    String color; //자동차 색
    double price; //자동차 가격
    double speed; //자동차 속도
    char geer; //기어 상태(P, R, N, D)
    boolean lights = true; //자동차 조명

    Tire tire = new Tire();
    Door door;
    Handle handle;

    public Car() {}

    double gasPedal(double kmh, char type){
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal(){
        speed = 0;
        return speed;
    }

    char changeGear(char type){
        geer = type;
        return geer;
    }

    boolean onOffLight(){
        lights = !lights;
        return lights;
    }

    void horn(){
        System.out.println("빵! 빵!");
    }

    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v = " + v);
        }
    }
}
