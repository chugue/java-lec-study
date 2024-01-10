package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 10000);

            BufferedWriter bw = new BufferedWriter(
                    //output보조 스트림
                    new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8)
            );
            bw.write("msg1" + "\n");
            bw.write("msg2");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
