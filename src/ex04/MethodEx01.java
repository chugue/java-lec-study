package ex04;

public class MethodEx01 {

    static void m1(){ // 호출시에 중괄호 안이 실행된다.  기본형
        System.out.println("m1");
    }

    static String m2(){ // 호출시에 중괄호 안이 실행된다.  반환을 하는 메소드
        System.out.println("m2");
        return "m2";
    }

    public static void main(String[] args) {

        m1(); // 스택메모리에 있는 메소드를 호출할려면, 클래스명을 같이 적어야 되고, 같은 클래스 안에 있다면은 클래스명을 생략할 수 있다.
        String result = m2(); // 호출 되기 전까지 10번 11번 라인이 없다. 메모리에 없기 때문에, 보이지 않고, 실행되는 순간 메모리에 뜨고 JVM이 인식한다.
              // 실행이 끝나면 "m2" 리턴값으로 바뀐다. String result = "m2" 와 동일한 모습이 된다.
        System.out.println("result : " + result);

    }
}
