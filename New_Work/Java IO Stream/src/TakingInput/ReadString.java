package TakingInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadString {
    public static void main(String[] args) {

        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter line of text ");
        System.out.println("Press 'stop' to end the reading");

        do {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
