package ex02;

import java.util.*;

public class Pizza {
    public static void main(String[] args) {
        double area1 = 2 * 3.141592 * 20 * 20;
        double area2 = 3.141592 * 30 * 30;

        System.out.println("20cm 피자 면적 = " + area1);
        System.out.println("30cm 피자 면적 = " + area2);
        System.out.println((area1 > area2)? "20cm 두 개" : "30cm 한 개");
                    // area1이 area2보다 참이라면 "20cm.."를 출력 거짓이라면 "30cm.." 을 출력한다.
    }
}
