package LambdaExpression;

interface Vehicle {
    void calculateEnginePower(int bhp, int area);
}

public class LambdaExp2 {

    public static void main(String[] args) {
        Vehicle vehicle = (bhp, area) -> System.out.println("Calculate Engine power " + bhp * area);

        vehicle.calculateEnginePower(19,50);
    }
}
