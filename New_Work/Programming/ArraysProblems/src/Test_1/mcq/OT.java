package Test_1.mcq;

public class OT {
    public static void main(String[] args) {
        int a, b, c, d;
        a = b = c = d = 20;
        a += b -= c *= d /= 20;

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
