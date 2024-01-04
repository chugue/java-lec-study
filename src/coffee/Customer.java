package coffee;

public class Customer {
    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }

    public void order(int choice) {
        Coffee coffee = barista.makeCoffee(choice);
    }
}
