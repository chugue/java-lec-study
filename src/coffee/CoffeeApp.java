package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Barista barista = new Barista();
        Customer customer = new Customer(barista);

        int choice = menu.showMenu();
        customer.order(choice);
    }
}
