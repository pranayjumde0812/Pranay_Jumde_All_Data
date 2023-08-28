package Chat_Server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        // Create client socket
        Socket s = new Socket("localhost",9999);

        // To send data to the server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        // To receive data from server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // To read data from keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        // Now start communicate

        String str, str1;

        while ((str = br.readLine()).equals("exit")){  // As long as the string are not typing exit

            dos.writeBytes(str+"\n");
            str1 = br.readLine();
            System.out.println(str1);
        }

        // Disconnect the server

        s.close();
        dos.close();
        br.close();
        kb.close();

    }
}
