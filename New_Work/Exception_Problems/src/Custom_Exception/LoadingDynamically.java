package Custom_Exception;

import java.lang.reflect.InvocationTargetException;

public class LoadingDynamically {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class.forName("Custom_Exception.MyException").getMethod("disp").invoke(new MyException());

        System.out.println("Class loaded");
    }
}
