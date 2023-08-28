package Connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client_1 {
    public static void main(String[] args) throws IOException {

        // Create Client socket
        Socket s = new Socket("localhost",7777);

        // Attach InputStream to socket
        InputStream obj = s.getInputStream();

        // To receive the data to this socket
        BufferedReader br = new BufferedReader(new InputStreamReader(obj));

        // Accept data coming from server

        String str;

        while ((str = br.readLine()) != null){
            System.out.println(str);
        }

        // Disconnect the server

        s.close();
        br.close();
    }
}
