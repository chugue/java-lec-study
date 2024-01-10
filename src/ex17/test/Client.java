package ex17.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("LocalHost", 20000);
            PrintWriter pw = new PrintWriter(
                    socket.getOutputStream(), true, Charset.forName("UTF-8"));
            Scanner sc = new Scanner(System.in);
            new Thread(() -> {
                while (true) {
                    String clientMsg = sc.nextLine();
                    pw.println(clientMsg);
                    System.out.println("클라이언트 : " + clientMsg);
                }
            }).start();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            new Thread(() -> {
                while (true) {
                    try {
                        String receivedMsg = br.readLine();
                        System.out.println("서버 : " + receivedMsg);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
