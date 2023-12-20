package ex04;

//설계도
public class Circle {
     int radius;

     // 생성자
    public Circle(int radius) {
        this.radius = radius;
        // 여기서 사용된 this. 은 현재 클래스내 상태값을 가르킨다. 필드값.
    }
    public Circle() {
        this(0);
        // 여기서 사용된 this()은 다른 복잡한 생성자를 의미한다.
        // this()는 반드시 생성자 안에서만 호출 가능하다.
        // this()는 반드시 첫 번째 문장이어야 한다.
        // this()는 다른 생성자를 호출할 때만 사용하여야 한다.
    }


    // 생성 될떄 무조건 실행되는 메소드
    double getArea(){
         return 3.14*radius*radius;
     }
}
