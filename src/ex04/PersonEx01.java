package ex04;

//설계도
class People {
    String name;
    int power;
    int hp;

    //객체 초기화 - 생성자 - 객체의 공통된 특성을 초기화 해준다.
    public People(String name, int power) {
        this.name = name;
        this.power = power;
        this.hp = 100;
    }
    //행위
    public void upgradePower(){
        this.power++;
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PersonEx01 {
    public static void main(String[] args) {
        People p1 = new People("티모", 10); // P1이 스택에 뜨고 값을 힙에 새로생긴 스코프 안에 값을 전달해준다.
        System.out.println(p1);

        p1.upgradePower(); // 힙에 있는 값이므로, 지역변수를 통해 호출해야된다.



    }
}
