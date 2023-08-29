package com.mkpits.pkg2;

public class Run {

    public int value1 = 150;
    protected double value2 = 1.77;
    String value3 = "Pranay";
    private long value4 = 123456754;

    public void test1() {
        System.out.println("This is Public test1() of Run class");
    }

    protected void test2() {
        System.out.println("This is Protected test2() of Run class");
    }

    void test3() {
        System.out.println("This is Default or Package Level test3() of Run class");
    }

    private void test4() {
        System.out.println("This is Private test4() of Run class");
    }


    public static void main(String[] args) {

        Run r1 = new Run();
        System.out.println(r1.value2);
        System.out.println(r1.value4);
    }
}
/*
   1) Private members and methods can only access in same class only.
 */