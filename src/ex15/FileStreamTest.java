package ex15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
    public static void main(String[] args) {
        byte[] list = {10, 20, 30, 40, 50, 60};

        try (FileOutputStream out = new FileOutputStream("D:\\WORKSPACE\\java_lec\\Study\\src\\ex15\\test.bin")) {
            for (byte b : list) {
                out.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}