package Tcp;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String host = "localhost";
        int port = 8000;
        Socket socket = new Socket(host,port);
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        while(true){
            int c = sc.nextInt();
            pw.println(c);
            pw.flush();
        }

    }
}
