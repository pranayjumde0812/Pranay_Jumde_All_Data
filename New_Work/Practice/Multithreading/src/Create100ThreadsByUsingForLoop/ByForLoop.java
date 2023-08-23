package Create100ThreadsByUsingForLoop;

public class ByForLoop {

    public static void main(String[] args) {

        RunClass runClass = new RunClass();

        for (int i = 1 ; i <= 100 ; i++){

            Thread thread = new Thread(runClass);
            thread.start();
        }
    }
}
