package week03.ABS;

public class Main {
    public static void main(String[] args) {
        Car car1 = new BenzCar();
        Car car2 = new AuidCar();
        Car car3 = new GenesisCar();
        car1.horn();
        car2.horn();
        car3.horn();
    }
}
