package chatServer.server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by antonia on 2017/09/26.
 */
public class Server {

    ServerSocket ss;
    ArrayList<ServerConnection> connections = new ArrayList<ServerConnection>();
    boolean shouldRun = true;


    public static void main(String[] args) {
        new Server();
    }

    public Server() {

        try {
            ss = new ServerSocket(6841);
            //server socket listening for new connections
            while(shouldRun) {
                Socket s = ss.accept();
                //when it detects it will pull in this socket and then pass in a
                //new server connection and reference to itself (see 1)
                ServerConnection sc = new ServerConnection(s, this); //new server connection
            // take socket called s and reference to server class (this) pass in an instance, of this object into
            // the server connection object
                sc.start(); // start the thread
                connections.add(sc); // sc add to connections
                //(1) then it passes to my connections array list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
