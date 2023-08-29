package com.mkpits.pkg1;

import com.mkpits.pkg2.Run;

public class Sample extends Run {
    public static void main(String[] args) {

        Run run = new Run();

        System.out.println("Program starts");

        System.out.println(run.value1);
        run.test1();

        Sample sample = new Sample();

        System.out.println(sample.value2);
        sample.test2();
    }
}
/*
    1) Default member cannot access outside the package
    2) Protected member can b only access outside the
       package with the inheritance, and we have to make child object then only we can use it.
       (Here after extending we have to create child class object of sample Line 15 then we are able to use
        protected member)
    3) default member cannot access outside package.
 */