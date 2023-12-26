package ex07.example;

//라이브러리 판매
interface EventListener {
    void action(); // 메소드가 구현되지 않음, 인터페이스는 어떤 클래스가 메서드를 반드시 구현하도록 강제하는 역할을 함
}
//라이브러리 판매자 생성
class MyApp {
    public void click (EventListener l){ //인터페이스 EventListner의 객체를 받음
        l.action(); // 변수l인 인터페이스의 action메소드를 호출
    }
}

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> { // click의 파라메터로 인터페이스의 객체를 받는 모습을 보고
            System.out.println("회원가입 로직이 실행됩니다.");
        });
    }
}
