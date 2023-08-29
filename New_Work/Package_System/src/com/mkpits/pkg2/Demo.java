package com.mkpits.pkg2;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Program starts");

        Run run = new Run();

        System.out.println(run.value1);
        run.test1();

        System.out.println(run.value2);
        run.test2();

        System.out.println(run.value3);
        run.test3();

    }
}
/*
    1) we can use public , default and protected member of same package.
 */