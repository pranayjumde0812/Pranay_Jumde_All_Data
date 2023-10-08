package Custom_Exception;

public class StringMisMatchException extends Exception {

    String message;

    StringMisMatchException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

