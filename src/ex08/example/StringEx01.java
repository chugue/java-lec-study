package ex08.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class StringEx01 {

    public static String encoding(String data) {

        return "";
    }

    public static String decoding(String encodingData) {
        return "";
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte
         // 인코딩 A2B3C4D5
         // 디코딩 AABBBCCCCDDDDD



        String[] token = data.split("");

        int count = 0;

        if (token[0].equals(token[1])){
            count++;
        }
        if (token[1].equals(token[2])){
            count++;
        }
        if (token[3].equals(token[2])){
            count++;
        }
        if (token[0].equals(token[3])){
            count++;
        }
        if (token[0].equals(token[4])){
            count++;
        }
        if (token[0].equals(token[5])){
            count++;
        }
        if (token[0].equals(token[6])){
            count++;
        }
        if (token[0].equals(token[7])){
            count++;
        }
        if (token[0].equals(token[8])){
            count++;
        }
        if (token[0].equals(token[9])){
            count++;
        }
        if (token[0].equals(token[10])){
            count++;
        }
        if (token[0].equals(token[11])){
            count++;
        }
        if (token[0].equals(token[12])){
            count++;
        }
        if (token[0].equals(token[13])){
            count++;
        }

        count = 0;
        if (token[1].equals(token[0])){
            count++;
        }
        if (token[1].equals(token[1])){
            count++;
        }
        if (token[1].equals(token[2])){
            count++;
        }
        if (token[1].equals(token[3])){
            count++;
        }
        if (token[1].equals(token[4])){
            count++;
        }
        if (token[1].equals(token[5])){
            count++;
        }
        if (token[1].equals(token[6])){
            count++;
        }
        if (token[1].equals(token[7])){
            count++;
        }
        if (token[1].equals(token[8])){
            count++;
        }
        if (token[1].equals(token[9])){
            count++;
        }
        if (token[1].equals(token[10])){
            count++;
        }
        if (token[1].equals(token[11])){
            count++;
        }
        if (token[1].equals(token[12])){
            count++;
        }
        if (token[1].equals(token[13])){
            count++;
        }

//
//
//        System.out.println(Arrays.toString(token));



    }
}