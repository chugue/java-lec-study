package ex16.minKyung;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Coffee {
    private String name;
    private int price;
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
class Menu {
    private Map<String, Coffee> menuItems;
    public Menu() {
        menuItems = new HashMap<>();
        menuItems.put("아메리카노", new Coffee("아메리카노", 2000));
        menuItems.put("카푸치노", new Coffee("카푸치노", 3000));
        menuItems.put("마끼아또", new Coffee("마끼아또", 4000));
        menuItems.put("에스프레소", new Coffee("에스프레소", 1500));
    }
    public Map<String, Coffee> getMenuItems() {
        return menuItems;
    }
}
class Barista {
    public void makeCoffee(Coffee coffee) {
        System.out.println("바리스타가 " + coffee.getName() + "를 다 만들었습니다. 가격은 " + coffee.getPrice() + "원 입니다.");
    }
}
class Customer {
    public String order() {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴를 골라주세요: ");
        return sc.nextLine();
    }
    public void receiveCoffee(Coffee coffee) {
        System.out.println("손님이 " + coffee.getName() + "를 받았습니다.");
    }
}
public class CoffeeApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        // 고객이 주문한 커피 이름을 받아옴
        Customer customer = new Customer();
        String orderedCoffeeName = customer.order();
        // 주문한 커피의 객체를 메뉴에서 가져옴
        Map<String, Coffee> menuItems = menu.getMenuItems();
        Coffee orderedCoffee = menuItems.get(orderedCoffeeName);
        if (orderedCoffee != null) {
            // 주문이 성공한 경우
            Barista barista = new Barista();
            // 바리스타에게 주문한 커피를 만들어 달라고 요청
            barista.makeCoffee(orderedCoffee);
            // 고객에게 커피를 전달하고 가격 안내
            customer.receiveCoffee(orderedCoffee);
        } else {
            // 주문이 실패한 경우
            System.out.println("죄송합니다. 해당 메뉴는 없습니다.");
        }
    }
}