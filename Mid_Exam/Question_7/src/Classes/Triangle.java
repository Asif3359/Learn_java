package Classes;

public class Triangle extends Shape {

    @Override
    public void  displayArea() {
        double area = 0.5 * getX() * getY() ;
        System.out.println("Display Area of Triangle "+ area);
    }
}
