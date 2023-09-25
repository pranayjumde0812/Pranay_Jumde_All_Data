package Custom_Exception;

public class StringMisMatchException extends Exception {

    @Override
    public String getMessage() {
        return "String is mismatched";
    }
}

class MyException {
    public static void main(String[] args) throws StringMisMatchException {

        String str1 = "Pavan";
        String str2 = "pavan";


        if (str1.equals(str2)) {
            System.out.println("Both strings are matched");
        } else {
            throw new StringMisMatchException();
        }
    }




}