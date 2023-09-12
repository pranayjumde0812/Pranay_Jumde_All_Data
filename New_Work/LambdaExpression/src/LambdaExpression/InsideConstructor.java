package LambdaExpression;

interface Shape1 {
    void calArea(int length, int width);
}

class Rectangle {

    Rectangle(int length1, int width1) {

        Shape1 shape1 = (len1, len2) -> {
            System.out.println("Calculate area " + len1 * len2);
        };

        shape1.calArea(length1, width1);
    }
}

class InsideConstructor {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(29, 90);

    }
}
