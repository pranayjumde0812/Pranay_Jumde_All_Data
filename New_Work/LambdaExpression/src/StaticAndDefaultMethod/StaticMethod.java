package StaticAndDefaultMethod;

interface Shape {

    void calculatePerimeter(int length, int width);

    static void diplay() {
        System.out.println("This is static method");
    }
}

class Rectangle {
    Rectangle(Shape shape) {
        shape.calculatePerimeter(10, 20);
//        Shape.diplay();
    }
}

public class StaticMethod {

    public static void main(String[] args) {

        //////////////////////////////////// Using AIC /////////////////////////////////////////

        new Rectangle(new Shape() {
            @Override
            public void calculatePerimeter(int length, int width) {
                System.out.println("Perimeter of Rectangle " + (2 * length + 2 * width));
            }
        });

        /////////////////////////// Using lambda expression ///////////////////////////////////

        Shape shape = (int a, int b) -> System.out.println("Perimeter of Rectangle " + (2 * a + 2 * b));
        shape.calculatePerimeter(27, 80);
    }
}
