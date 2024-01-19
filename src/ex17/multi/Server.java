package ex17.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;

class ServerSend extends Thread {
    private Socket socket;
    public ServerSend (Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(
                    socket.getOutputStream(), true, Charset.forName("UTF-8"));
            Scanner sc = new Scanner(System.in);
            while (true) {
                String serverMsg = sc.nextLine();
                pw.println(serverMsg);
                System.out.println("서버 : " + serverMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class ServerReceived extends Thread {
    private Socket socket;
    public ServerReceived (Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            while (true) {
                String requestMsg = br.readLine ();
                System.out.println("클라이언트 : " + requestMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Server extends Thread{
    public static void main(String[] args) {
        try {
            //연결
            ServerSocket serverSocket = new ServerSocket(20000);
            System.out.println("서버가 연결을 기다리고 있습니다.");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 연결 되었습니다.");
            Thread serverSend = new ServerSend(socket);
            Thread serverReceived = new ServerReceived(socket);
            serverSend.start();
            serverReceived.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
