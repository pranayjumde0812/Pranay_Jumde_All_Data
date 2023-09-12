package StaticAndDefaultMethod;

interface Shape1 {

    void calArea(int r);

    default void display() {
        System.out.println("This is display method");
    }
}

class Circle {

    Circle(Shape1 shape1) {
        shape1.calArea(4);

        shape1.display();
    }
}

public class DefaultMethod {
    public static void main(String[] args) {

        ///////////////////////////////// Using AIC ///////////////////////////////////////
        new Circle(new Shape1() {

            @Override
            public void calArea(int r) {
                System.out.println("Area of circle = " + r * r);
            }
        });

        new Circle(new Shape1() {

            @Override
            public void calArea(int r) {
                System.out.println("New Area of circle with default method");
            }

            @Override
            public void display() {
                System.out.println("Overridden Default method");
            }

        });

        ////////////////////////////////// Using Lambda exp ///////////////////////////////////////

        Shape1 shape1 = (int radius) -> {

            System.out.println("Area of circle = " + Math.PI * radius * radius);
        };

        shape1.calArea(6);
        shape1.display();

    }
}
