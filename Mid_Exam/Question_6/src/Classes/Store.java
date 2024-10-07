package Classes;

public abstract class Store {
    private String storename ;

    public Store (String storename) {
        this.storename = storename;
    }

    public void showItem()
    {
        System.out.println("Items available in the store"+storename);
    }

    public abstract int getPrice();
    public abstract void displayInfo();

}
