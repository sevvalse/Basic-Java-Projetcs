package CarPark;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
        setVehicleSize(VehicleSize.MEDIUM);
    }

    @Override
    int calculateParkingFee(int parkingDuration) {
        return parkingDuration * getVehicleSize().size();
    }

    public String toString() {
        return "Car Licence Plate: " + getLicensePlate() + "\nVehicle Size: " + getVehicleSize() + "\n";
    }
}
