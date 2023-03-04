package HM.Networking_in_Java.App1;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            // Server socket responsible for waiting for clients
            System.out.println("Waiting for clients...");
            // Server Socket created
            ServerSocket SS = new ServerSocket(9886);
            // Waiting to connect
            Socket SOC = SS.accept();
            // This would run when a SOC object will be created
            // or a request comes from client leading to a connection
            System.out.println("Connection established");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}