package ex04;

class Person2{  // custom 자료형 정수형, 문자형을 담을수 있는 그릇
    int age = 10;
    char gender = '남';
}

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남");
        System.out.println("2년 지남");
        System.out.println("3년 지남");

        Person2 p2 = new Person2(); // new 키워드는 동적 메모리영역 활성화
                                    // 동적메모리영역(heap)에서 여러 클래스를 생성할 수 있기떄문에
                                    // 클래스로 없으므로 변수주소를 할당해줘야 된다. 변수는 'p'
        System.out.println(p2.age);
        System.out.println(p2.gender);
        System.out.println("메인 종료");

    }
}
