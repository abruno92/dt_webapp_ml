package sw3.alex.tcp;

import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by antonia on 2017/09/21.
 */

public class MyTCPClient {

    public static void main(String[] args) {
        System.out.println("--Client up and running--");
        final int PORT = 12456;
        final String IP = "127.0.0.1";
        try {
            InetAddress inetAddress = InetAddress.getByName(IP);
            Socket socket = new Socket(inetAddress, PORT);
            Scanner sc = new Scanner(socket.getInputStream());
            String msg = sc.nextLine();
            System.out.println(msg);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
