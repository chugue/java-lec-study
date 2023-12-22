package ex06.example4;

public class Dragoon extends Protoss {
    String name;
    public Dragoon(String name) {
        this.name = name;
    }
    /*
    Protoss클래스에서 정의된 attack()메소드를 자식 Dragoon클래스에서 같은 이름으로 오버라이딩 하였다.
    다른 3개의 객체들도 같은 방법으로 attack()메소드를 재정의 하였다.
     */
    public void attack(){
        System.out.println("드라군이 공격합니다." + name);
    }
}
