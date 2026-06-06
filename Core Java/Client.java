import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket =
                    new Socket("localhost", 5000);

            DataInputStream in =
                    new DataInputStream(socket.getInputStream());

            DataOutputStream out =
                    new DataOutputStream(socket.getOutputStream());

            out.writeUTF("Hello Server!");

            String reply =
                    in.readUTF();

            System.out.println("Server: " + reply);

            socket.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}