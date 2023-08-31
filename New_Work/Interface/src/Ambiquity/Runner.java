package Ambiquity;

public class Runner implements One , Two {


    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.myName();
    }

    @Override
    public void myName() {
        One.super.myName();
    }

}
