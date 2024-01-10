package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;


class ClientSend extends Thread {
    private Socket socket;
    public ClientSend (Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(
                    socket.getOutputStream(), true, Charset.forName("UTF-8"));
            Scanner sc = new Scanner(System.in);
            while (true) {
                String clientMsg = sc.nextLine();
                pw.println(clientMsg);
                System.out.println("클라이언트 : " + clientMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class ClientReceive extends Thread {
    private Socket socket;
    public ClientReceive (Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            while (true) {
                String responseMsg = br.readLine();
                System.out.println("서버 : " + responseMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Client {
    static Socket socket;
    public static void main(String[] args) {
        try {
            socket = new Socket("192.168.0.89", 20000);
            Thread clientSend = new ClientSend(socket);
            Thread clientReceive = new ClientReceive(socket);
            clientSend.start();
            clientReceive.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
