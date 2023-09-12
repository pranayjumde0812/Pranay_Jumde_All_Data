package LambdaExpression;

interface Shape {
    void calculatePerimeter();
}

public class LambdaExp1 {
    public static void main(String[] args) {

        Shape shape = () -> {
            System.out.println("Perimeter is 10");
            System.out.println("Perimeter is 100");
            System.out.println("Perimeter is 3000");
        };

        shape.calculatePerimeter();
    }
}
