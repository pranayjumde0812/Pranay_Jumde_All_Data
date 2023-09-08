package Question_2;

public class TwoWheeler extends Car implements MotorBike, Cycle{

    @Override
    public void speed() {
        System.out.println("Speed is 90 Km/Hr");
    }

    @Override
    public void distance() {
        System.out.println("The distance is 50 meter");
    }

    @Override
    public void display() {
        System.out.println("Splender");
    }
}
