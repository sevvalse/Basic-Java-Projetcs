package CarPark;

public class Truck extends Vehicle {

    public Truck(String licensePlate) {
        super(licensePlate);
        setVehicleSize(VehicleSize.LARGE);
    }

    @Override
    int calculateParkingFee(int parkingDuration) {
        return parkingDuration * getVehicleSize().size();
    }

    public String toString() {
        return "Truck Licence Plate: " + getLicensePlate() + "\nVehicle Size: " + getVehicleSize() + "\n";
    }
}
