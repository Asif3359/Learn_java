package Classes;

public class Rectangle extends Shape {
    @Override
    public void  displayArea() {
        double area = getX() * getY() ;
        System.out.println("Display Area of Rectangle "+ area);
    }
}
