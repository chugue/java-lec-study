package ex15;

import java.io.*;

// 상대 경로 : 내 파일의(.class) 위치를 기반으로 경로 정하는 것
// 절대 경로 : 루트에서 부터 경로를 찾는 것
public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("src\\ex15\\hello.txt"));
            outputStream = new PrintWriter(new FileWriter("src\\ex15\\hello.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
            System.out.println(l);
        }
            finally {
            if (inputStream != null) {inputStream.close();}
            if (outputStream != null) {outputStream.close();}
        }
    }
}
