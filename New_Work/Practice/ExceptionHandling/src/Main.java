import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//   Code For File reading Using exception handling using try, catch and  finally (Used for closing heavy weight object).
//       Code Started
        FileReader fr = null;

        try {
            fr = new FileReader("E:/MKPITS/MyNotes/InterviewQuestion.txt");

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        End Of reading file Code


    }
}