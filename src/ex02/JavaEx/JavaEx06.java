package ex02.JavaEx;

import java.util.Scanner;

public class JavaEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("드라이브 명을 입력하세요 (c): ");
        String drvName = sc.next();

        System.out.print("디렉토리 이름을 입력하세요 (\\test\\): ");
        String drtName = sc.next();

        System.out.print("파일 이름을 입력하세요 (sample): ");
        String fName = sc.next();

        System.out.print("파일 확장자를 입력하세요 (py): ");
        String ext = sc.next();

        System.out.println(drvName +":"+ drtName + fName + "." + ext );
    }
}
