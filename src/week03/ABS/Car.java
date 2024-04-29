package week03.ABS;

public abstract class Car {

    double speed;

    public double gasPedal(double kmh){
        speed = kmh;
        return speed;
    }

    public double brakePedal(){
        speed = 0;
        return speed;
    }

    public abstract void horn();
}
