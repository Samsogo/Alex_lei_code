package Tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket s = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = br.readLine();
        while(line!=null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}
