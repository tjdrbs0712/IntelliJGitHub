package week03.CarSample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLight();
        System.out.println(lights);

        System.out.println("car.geer = " + car.geer);

        car.carSpeeds(100,80);
        System.out.println();
        car.carSpeeds(100,200,300,400);
    }
}
