package Code.singlton;

public class SingletonEx {
    public static void main(String[] args) {

        try {
            CreateSingleton s1 = CreateSingleton.getInstance();

            System.out.println(s1);

            CreateSingleton s2 = CreateSingleton.getInstance();

            System.out.println(s2);
        } catch (RuntimeException e) {
            System.out.println("Max obj created");
        }

    }
}
