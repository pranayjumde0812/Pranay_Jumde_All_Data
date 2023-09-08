package TakingInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharacter {
    public static void main(String[] args) throws IOException {

        char ch;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, 'q' to quit.");

        // read characters from user until 'q'.
        do {
            ch = (char) br.read();
            System.out.println(ch);

        } while (ch != 'q');
    }
}
