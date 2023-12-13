package ex02;

import java.util.*;

public class InputString {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner sc = new Scanner(System.in);
                    // Scanner라는 새로운 객체를 힙메모리에 할당한다. 변수 이름은 'sc'

        System.out.print("이름을 입력하시오 :");
        name = sc.nextLine();
                    // main의 name 필드에 scanner클래스의 사용자로 부터 입력을 받는 기능을 사용한다.
                    // 한 줄 전체를 읽어오기 위해서 nextLine을 사용한다.

        System.out.print("나이를 입력하시오 : ");
        age = sc.nextInt();
                    // main의 age필드에 scanner클래스의 사용자로 부터 입력을 받는 기능을 사용한다.
        System.out.println(name + "님 안녕하세요!" + age + "살이시네요.");
    }
}
