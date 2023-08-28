package Chat_Server;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        // Create Server Socket
        ServerSocket ss = new ServerSocket(9999);

        // Make this socket wait for client connection
        Socket s = ss.accept();
        System.out.println("Connection Established");

        // To send data to the client
        PrintStream ps = new PrintStream(s.getOutputStream());

        // To receive data from client
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // To read data from keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        // Now communicate
        while (true){
            String str, str1;

            while ((str = br.readLine()) != null){
                System.out.println(str);

                str1 = kb.readLine();
                ps.println(str1);
            }

            // Disconnect the server

            ss.close();
            s.close();
            ps.close();
            br.close();
            kb.close();
            System.exit(0);
        }

    }
}
