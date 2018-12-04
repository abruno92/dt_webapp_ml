package myChatServer.swc.ab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    Socket s; //global Variable
    DataInputStream dIn;
    DataOutputStream dOut;

    public static void main(String[] args) {
        new Client(); //Make a constructor //Constructor returns client object  でも使わなかった
    }

    public Client() {

        try {

            s = new Socket("localhost", 6980);
            dIn = new DataInputStream(s.getInputStream());
            dOut = new DataOutputStream(s.getOutputStream());

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

            try {
                dOut.writeUTF(input);
                dOut.flush(); // make sure all of the data is sent out, no sneaky

                while(dIn.available() == 0) { //while there is nothing available for it to read

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
                break; //break out the while loop, so we can close streams at the end
            }

        }

        try { //no funky situations where it doesnt close properly
            dIn.close();
            dOut.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

