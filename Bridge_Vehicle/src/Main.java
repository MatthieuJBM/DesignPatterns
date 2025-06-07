import abstraction.Bike;
import abstraction.Car;
import abstraction.Vehicle;
import implementation.Assemble;
import implementation.Produce;

public class Main {
    public static void main(String[] args) {
        System.out.println("BRIDGE PATTERN - VEHICLE!");

        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
