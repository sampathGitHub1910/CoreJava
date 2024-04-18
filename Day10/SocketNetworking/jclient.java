package Day10.SocketNetworking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class jclient {

    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    //24.0.0.1 ---> Localhost
    public jclient(String addr, int port){
        try {
            socket = new Socket(addr, port);
            System.out.println("Connected");

            //take input
            input = new DataInputStream(System.in);

            //output
            output = new DataOutputStream(socket.getOutputStream());

            String data = input.readLine(); // "Hello world"
            output.writeUTF(data);

            input.close();
            output.close();
            socket.close();
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        jclient cJclient = new jclient("127.0.0.1", 8080);
    }
}
