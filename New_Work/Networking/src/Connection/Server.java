package Connection;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

// Create a server that send messages
public class Server {

    public static void main(String[] args) throws IOException {

        // Create Connection.Server socket

        ServerSocket ss = new ServerSocket(7777);

        // Make that socket accept client connection

        Socket s = ss.accept();
        System.out.println("Connection established");

        // Attach output stream to socket

        OutputStream obj = s.getOutputStream();

        // to send the data to Socket

        PrintStream ps = new PrintStream(obj);

        // Now send data
        String str = "Hello Pranay";

        ps.println(str);

        ps.println("Bye Bye!!!");

        // Disconnect the server
        s.close();
        ps.close();
    }
}
