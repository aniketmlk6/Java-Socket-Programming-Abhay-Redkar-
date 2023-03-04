package HM.Networking_in_Java.App4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

            // Reading data sent by clint using Inputstream
            BufferedReader in = new BufferedReader(new InputStreamReader(SOC.getInputStream()));
            int num  = Integer.parseInt(in.readLine()); // reading...  [now str contains data sent]

            // Server processing
            int fact = calculateFactorial(num);


            // sending back same data
            PrintWriter out = new PrintWriter(SOC.getOutputStream(), true);
            out.println("Server says: " + fact); // sending away same data back to client


        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    static int calculateFactorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;

    }

}