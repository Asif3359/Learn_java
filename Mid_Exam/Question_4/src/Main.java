import Classes.Bus;
import Classes.Car;
import Classes.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car(120 , 4);
        Vehicle bus = new Bus(80, 25);

        System.out.println(car);
        System.out.println(bus);

        if (car.getSpeed() > bus.getSpeed()) {
            System.out.println("Car speed is fast");
        }
        else if (car.getSpeed() < bus.getSpeed()) {
            System.out.println(" Bus is fast");
        }
        else {
            System.out.println("Car and Bus speed is same");
        }

        if (car.getSits() > bus.getSits()) {
            System.out.println("Car have max sits ");
        }
        else if (car.getSits() < bus.getSits()) {
            System.out.println(" Bus have max sits ");
        }
        else {
            System.out.println("car and bus have same sits ");
        }
    }
}