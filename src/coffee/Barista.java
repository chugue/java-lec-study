package coffee;

public class Barista {
    String ment;

    public Coffee makeCoffee(int choice) {
        Coffee order = new Coffee(choice);
        ment = "주문하신 " + order.status;
        System.out.println(ment);
        return order;
    }
}
