package ex04;

//설계도
public class Circle {
     public int radius;
     public String color;

     // 생성자
    public Circle(int r) {
        radius = r;
    }

    // 생성 될떄 무조건 실행되는 메소드
    public double getArea(){
         return 3.14*radius*radius;
     }
}
