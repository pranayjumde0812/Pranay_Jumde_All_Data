package Code.singlton;

public class CreateOnly10Objects {

    private static CreateOnly10Objects s = null;

    private static int countObject = 0;

    private CreateOnly10Objects() {
        countObject++;
    }

    public static CreateOnly10Objects getInstance() throws Exception {

        if (countObject < 10) {
            s = new CreateOnly10Objects();
        } else {
            throw new Exception("10 objects are created");
        }
        return s;
    }


}
