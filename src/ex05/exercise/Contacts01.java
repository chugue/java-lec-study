package ex05.exercise;

import java.util.Scanner;
import java.util.Scanner;

public class Contacts01 {
    private String name;
    private String tel;
    private String email;
    private static int count = 0; // 저장된 지인들의 수를 추적

    // 생성자
    public Contacts01(String name, String tel, String email) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        count++; // 새 연락처 객체가 생성될 때마다 count 증가
    }

    // name, tel, email에 대한 접근자(getter) 및 설정자(setter) 메서드는 필요에 따라 추가합니다.

    // count에 대한 접근자 (setter는 필요 없음)
    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Contact{" + "name='" + name + '\'' + ", tel='" + tel + '\'' + ", email='" + email + '\'' + '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contacts01[] contacts = new Contacts01[100]; // 최대 100개의 연락처를 저장할 수 있는 배열

        while (Contacts01.getCount() < contacts.length) {
            System.out.println("연락처를 입력하십시오 (종료 -1)");
            System.out.print("이름과 전화번호, 이메일을 입력하십시오 : ");
            String input = scanner.nextLine();

            if ("-1".equals(input)) {
                break; // 사용자가 종료를 원하면 반복문 종료
            }

            String[] parts = input.split("\\s+"); // 입력을 공백을 기준으로 분리
            if (parts.length >= 3) {
                // 입력받은 정보로 Contact 객체를 생성하고 배열에 저장
                contacts[Contacts01.getCount()] = new Contacts01(parts[0], parts[1], parts[2]);
            } else {
                System.out.println("올바른 형식으로 입력해주세요.");
            }
        }

        // 저장된 연락처 출력 (예시)
        System.out.println("저장된 연락처:");
        for (int i = 0; i < Contacts01.getCount(); i++) {
            System.out.println(contacts[i]);
        }

        scanner.close(); // Scanner 객체를 닫아주는 것이 좋습니다.
    }
}
