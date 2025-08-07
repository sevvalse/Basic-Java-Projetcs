package Lab_6;

public class Motorcycle extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
        setVehicleSize(VehicleSize.SMALL);
    }

    @Override
    int calculateParkingFee(int parkingDuration) {
        return parkingDuration * getVehicleSize().size();
    }

    public String toString() {
        return "Motorcycle Licence Plate: " + getLicensePlate() + "\nVehicle Size: " + getVehicleSize() + "\n";
    }
}
