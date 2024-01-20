package ex17.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Server_01 {
    public static void main(String[] args) {
        new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(20000)) {
                System.out.println("서버가 연결을 기다리고 있습니다. ");
                while (true) {
                    try (Socket socket = serverSocket.accept()) {
                        System.out.println("클라이언트가 연결되었습니다. ");
                        // 메시지 받기
                        try (BufferedReader br = new BufferedReader(
                                new InputStreamReader(socket.getInputStream()))) {
                            new Thread(() -> {
                                while (true) {
                                    try {
                                        String receivedMsg = br.readLine();
                                        System.out.println("클라이언트 : " + receivedMsg);
                                        if (receivedMsg.equalsIgnoreCase("quit")) {
                                            System.out.println("클라이언트 측에서 연결을 종료하였습니다.");
                                            break;
                                        }
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                            }).start();
                        }
                        //메시지 쓰기
                        try (PrintWriter pw = new PrintWriter(
                                socket.getOutputStream(), true, Charset.forName("UTF-8"))) {
                            Scanner sc = new Scanner(System.in);
                            new Thread(() -> {
                                while (true) {
                                    String clientMsg = sc.nextLine();
                                    pw.println(clientMsg);
                                    System.out.println("서버 : " + clientMsg);
                                    if (clientMsg.equalsIgnoreCase("quit")) {
                                        System.out.println("서버측에서 연결을 종료하였습니다.");
                                        break;
                                    }
                                }
                            }).start();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
