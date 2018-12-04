package alex.swc3.iptalking;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MyUDP8081 {
    private static final int PORT_IN = 4569;
    private static final int PORT_OUT = 4568;
    private static final String IP_IN = "10.111.183.255";
    private static final String IP_OUT = "10.111.180.105";

    private static DatagramSocket socket;
    private static InetAddress inetAddressIn;
    private static InetAddress inetAddressOut;

    public static void main(String[] args) {
        System.out.println("app for sending is running now");

        try {
            inetAddressIn = InetAddress.getByName(IP_IN);
            inetAddressOut = InetAddress.getByName(IP_OUT);
            socket = new DatagramSocket(PORT_IN, inetAddressIn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread tSend = new Thread(() -> {
            while (true) {
                byte[] dataOut;
                Scanner sc = new Scanner(System.in);
                System.out.println("Type your msg:");
                String msgToSend = sc.nextLine();
                dataOut = msgToSend.getBytes();
                DatagramPacket packet =
                        new DatagramPacket(
                                dataOut,
                                dataOut.length,
                                inetAddressOut,
                                PORT_OUT);

                try {
                    socket.send(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("data was sent");
            }
        });

        Thread tRecive = new Thread(() -> {
            while (true) {
                byte[] dataIn = new byte[1024];
                DatagramPacket packetIn =
                        new DatagramPacket(dataIn,
                                dataIn.length);

                try {
                    socket.receive(packetIn);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("HERE IS THE DATA");
                String msgToPrint = (new String(dataIn));
                System.out.println(msgToPrint.trim());
            }
        });

        tSend.start();
        tRecive.start();

    }
}
