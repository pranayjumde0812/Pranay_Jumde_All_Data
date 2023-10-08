package Custom_Exception;

public class MyException {
    public static void disp() throws StringMisMatchException {

        String str1 = "Pavan";
        String str2 = "pavan";


        if (str1.equals(str2)) {
            System.out.println("Both strings are matched");
        } else {
            throw new StringMisMatchException("Exception Occur");
        }
    }
}
