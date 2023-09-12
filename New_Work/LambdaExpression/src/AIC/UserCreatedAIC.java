package AIC;

interface Shape {
    void calculateArea();
}

class Circle {

    Circle(Shape shape) {
        shape.calculateArea();
    }
}

public class UserCreatedAIC {

    public static void main(String[] args) {

        new Circle(new Shape() {
            @Override
            public void calculateArea() {
                System.out.println("Area of circle");
            }
        });

    }
}
