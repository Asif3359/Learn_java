import Classes.Bookstore;
import Classes.Ricestore;
import Classes.Store;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store bookstore = new Bookstore(100, "Life of java");
        Store ricestore = new Ricestore(100, "Life of code");

        bookstore.showItem();
        bookstore.displayInfo();

        ricestore.showItem();
        ricestore.displayInfo();
    }
}