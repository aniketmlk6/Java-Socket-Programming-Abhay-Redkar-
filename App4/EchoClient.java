package HM.Networking_in_Java.App4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client started");
            // Client Socket connecting to Server socket
            // Note: port number matches
            Socket SOC = new Socket("localhost", 9886);

//            ...........................

            // Taking user input (you can use scanner too)
//            BufferedReader userInput =new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num =sc.nextInt();

//            ...........................

//            After establishing connection, sending data to server using OutputStream
            PrintWriter out = new PrintWriter(SOC.getOutputStream(), true);
            out.println(num); // sending ...... sent!

 //            server sends something back reading and printing
            BufferedReader in = new BufferedReader(new InputStreamReader(SOC.getInputStream()));
            System.out.println(in.readLine()); // reading...  and print

            // closing connection
            SOC.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
