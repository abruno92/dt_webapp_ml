package sw3.alex.tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTCPServer {

    public static void main(String[] args) {

        System.out.println("--Server up--");

        final int PORT = 12456;
        try{

            ServerSocket server = new ServerSocket(PORT);
            Socket socket = server.accept();
            System.out.println("--Server up--");
            String welcomeMsg = "アレクス太い豚";
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.write(welcomeMsg);
            out.flush();
            out.close();
            socket.close(); //close the socket this way its not going to come back

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
