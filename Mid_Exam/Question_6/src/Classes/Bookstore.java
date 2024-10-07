package Classes;

public class Bookstore extends Store {

    private int price;
    private String name ;
    public Bookstore(int price, String name) {
        super("Bookstore");
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + " Price: " + price);
    }
}
