package ex04;

class Pizza {
    int size;
    String type;

    public Pizza() { // 생성자 : 메소드 같이 생겼는데, 반환값 없이 클래스 명이랑 같은 메소드. 객체의 상태를 초기화해준다.
        size = 12;
        type = "슈퍼슈프림";
    }

    public Pizza(int s, String t) {
        size = s;
        type = t;
    }
}
public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza();
        System.out.println("("+obj1.type+ " , " +obj1.size+ ")");

        Pizza obj2 = new Pizza(24, "포테이토");
        System.out.println("("+obj2.type+ " , " +obj2.size+ ")");
    }
}
