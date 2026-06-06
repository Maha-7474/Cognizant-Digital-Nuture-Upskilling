import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket =
                    new ServerSocket(5000);

            System.out.println("Server is waiting for connection...");

            Socket socket =
                    serverSocket.accept();

            System.out.println("Client connected!");

            DataInputStream in =
                    new DataInputStream(socket.getInputStream());

            DataOutputStream out =
                    new DataOutputStream(socket.getOutputStream());

            String message =
                    in.readUTF();

            System.out.println("Client: " + message);

            out.writeUTF("Hello Client!");

            socket.close();
            serverSocket.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}