package CarPark;

import static java.io.IO.println;

public class Main {
    public static void main(String[] args) {
        Vehicle motor = new Motorcycle("35 ABC 1234");
        Vehicle truck = new Truck("44 KL 987");
        Vehicle car = new Car("34 DF 056");

        CarPark cp = new CarPark(10);

        cp.parkVehicle(motor);
        cp.parkVehicle(truck);

        cp.releaseVehicle(motor, 5);
        cp.parkVehicle(car);
        cp.releaseVehicle(truck, 3);
        System.out.println(cp);
    }
}
