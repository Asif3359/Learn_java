import Classes.Rectangle;
import Classes.Shape;
import Classes.Triangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape shape;
        shape = new Triangle();
        shape.setDate(10,5);
        shape.displayArea();

        shape = new Rectangle();
        shape.setDate(10,20);
        shape.displayArea();

    }
}