package coffee;
import java.util.*;
import java.lang.String;

public class Menu {
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
            System.out.println("메뉴 (" + (i) + "번) : " + menu.get(i-1).item + ",\t 가격 : " + menu.get(i-1).price);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("원하시는 메뉴를 적어주세요 : ");
        choice = (sc.nextInt()-1);
        System.out.println(menu.get(choice).item + "(을/를)선택하셨습니다.");
        sc.close();
        return choice;
    }
}

