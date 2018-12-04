package chatServer.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by antonia on 2017/09/28.
 */
public class ClientConnection extends Thread{

    Socket s; //global Variable
    DataInputStream dIn;
    DataOutputStream dOut;
    boolean shouldRun = true;

    public ClientConnection(Socket socket, Client client){

        s = socket;

    }

    public void sendStringToServer(String text) {

        try {
            dOut.writeUTF(text);
            dOut.flush(); // make sure all of the data is sent out, no sneaky
        } catch (IOException e) {
            e.printStackTrace();
            close();
        }

    }


        public void run(){

            try {
                dIn = new DataInputStream(s.getInputStream());
                dOut = new DataOutputStream(s.getOutputStream());

                while(shouldRun) {
                    try {
                        while (dIn.available() == 0) { //while there is nothing available for it to read
                            try {
                                Thread.sleep(1); //breather on the CPU
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        String reply = dIn.readUTF();
                        System.out.println(reply);

                    } catch (IOException e) {
                        e.printStackTrace();
                        close();
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
                close();
            }

        }

    public void close(){
        try { //no funky situations where it doesn't close properly
            dIn.close();
            dOut.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
