package chatServer.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by antonia on 2017/09/26.

 Making multithreading so my chat server can handle multiple
 connections. It can receive data whilst it is coming in and
 when you are typing

 This class handles connections

 */

public class ServerConnection extends Thread{

    Socket socket;
    Server server = new Server();
    DataInputStream dIn;
    DataOutputStream dOut;
    boolean shouldRun = true; // so while loop runs normally


    public ServerConnection(Socket socket, Server server){

        super("ServerConnectionThread");
        this.socket = socket;
        this.server = server;

    }

    public void sendStringToClient(String text){
        try {
            dOut.writeUTF(text);
            dOut.flush(); // make sure all my data is cleared out the stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendStringToAllClients(String text){

        for(int i =0; i < server.connections.size(); i ++){ //iterate through all the connections
           ServerConnection sc = server.connections.get(i);
           sc.sendStringToClient(text);
        }

    }

    //override the default run method
    public void run(){
        try {
            dIn = new DataInputStream(socket.getInputStream()); //hey is there data
            dOut = new DataOutputStream(socket.getOutputStream()); //if there is data send string to all of them
            while(shouldRun) {
                while (dIn.available() == 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String textIn = dIn.readUTF();
                sendStringToAllClients(textIn);

            }
                dIn.close();
                dOut.close();
                socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



