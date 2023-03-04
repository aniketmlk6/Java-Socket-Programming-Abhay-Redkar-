package HM.Networking_in_Java.App1;

import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try
        {
            System.out.println("Client started");
            // Client Socket connecting to Server socket
            // Note: port number matches
            Socket SOC = new Socket("localhost", 9886);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
