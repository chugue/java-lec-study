package coffee;


import java.util.ArrayList;
import java.util.Scanner;

class Coffee {
    String status = "preparing";
    int water_ml;
    int shots;
    int milk_ml;
    int caramel_sp;

    public Coffee(int choice) {
        switch (choice){
            case 0:
                americano();
                break;
            case 1:
                macchiato();
                break;
            case 2:
                cafelatte();
                break;
            case 3:
                espresso();
                break;
            default :
                System.out.println("잘못된 번호를 선택하셨습니다.");
        }
    }
    public void americano(){
        water_ml = 300;
        shots = 2;
        milk_ml = 0;
        status = "아메리카노 조리가 완료되었습니다";
    }
    public void macchiato(){
        water_ml = 100;
        shots = 2;
        milk_ml = 400;
        caramel_sp = 3;
        status = "마끼아또 조리가 완료되었습니다.";
    }
    public void cafelatte(){
        water_ml = 100;
        shots = 2;
        milk_ml = 400;
        status = "카페라떼 조리가 완료되었습니다.";
    }
    public void espresso(){
        water_ml = 100;
        shots = 2;
        status = "에스프레소 조리가 완료되었습니다.";
    }
}

class Barista {
    String ment;

    public Coffee makeCoffee(int choice) {
        Coffee order = new Coffee(choice);
        ment = "주문하신 " + order.status;
        System.out.println(ment);
        return order;
    }
}

class Menu {
    String item;
    String price;
    int choice;

    public Menu() {
    }

    public Menu(String item, String price) {
        this.item = item;
        this.price = price;
    }

    public int showMenu() {
        ArrayList<Menu> menu = new ArrayList<>();
        menu.add(new Menu("아메리카노", "2000원"));
        menu.add(new Menu("카페라떼", "3000원"));
        menu.add(new Menu("마끼아또", "4000원"));
        menu.add(new Menu("에스프레소", "2000원"));

        for (int i = 1; i < menu.size() + 1; i++) {
            System.out.println("메뉴 (" + (i) + "번) : " + menu.get(i-1).item + ", \t 가격 : " + menu.get(i-1).price);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("원하시는 메뉴를 적어주세요 : ");
        choice = (sc.nextInt()-1);
        System.out.println(menu.get(choice).item + "(을/를)선택하셨습니다.");
        sc.close();
        return choice;
    }
}

class Customer {
    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }

    public void order(int choice) {
        Coffee coffee = barista.makeCoffee(choice);
    }
}

public class CoffeeApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Barista barista = new Barista();
        Customer customer = new Customer(barista);

        int choice = menu.showMenu();
        customer.order(choice);
    }
}