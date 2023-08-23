package Code.singlton;

public class CreateSingleton {

    private static CreateSingleton s = null;

    public String str;

    private CreateSingleton() {
        str = "Singleton class";
    }

    public static CreateSingleton getInstance() {

        if (s == null) {
            s = new CreateSingleton();
        } else {
            throw new RuntimeException("Single instance of object is already created");
        }
        return s;
    }
}
