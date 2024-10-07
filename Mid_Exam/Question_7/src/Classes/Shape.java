package Classes;

public class Shape {
    private double x;
    private double y;

    public void setDate (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void displayArea () {
        System.out.println("Dimension 1:"+this.x);
        System.out.println("Dimension 2:"+this.y);
    }
}
