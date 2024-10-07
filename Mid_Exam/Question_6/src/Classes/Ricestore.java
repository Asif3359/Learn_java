package Classes;

public class Ricestore extends Store {
    private int price;
    private String name;
    public Ricestore(int price, String name) {
        super("Ricestore");
        this.price = price;
        this.name = name;
    }

    @Override
    public  int getPrice() {
        return price;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name+" Price: " + price);
    }
}
