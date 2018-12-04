package chatServer.client;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    ClientConnection cc;

    public static void main(String[] args) {
        new Client(); //Make a constructor //Constructor returns client object  でも使わなかった
    }

    public Client() {

        try {

            Socket s = new Socket("localhost", 6841);
            cc = new ClientConnection(s, this); //reference the client connection class
            cc.start();

            listenForInput();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listenForInput(){
        Scanner console = new Scanner(System.in);

        while(true){

            while(!console.hasNextLine()){

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            String input = console.nextLine();

            if(input.toLowerCase().equals("QUIT")){ // check if the input from the console = quit, break out of while loop
                break;
            }

            cc.sendStringToServer(input);

        }
      cc.close();
    }

}

