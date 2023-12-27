package ex06.example07;

public class BurgerSet { // has 관계
        private Burger burger;
        private Coke coke; // 구성을 필드값에 객체를 넣어서 composition형태를 만든다. 상속안하고 잘 만들어진 클래스를 가져다 쓴다.

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public int getTotalPrice() {
        return burger.getPrice() + coke.getPrice();
    }
}
