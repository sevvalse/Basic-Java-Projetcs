package Lab_6;

public abstract class Vehicle {
    private String licensePlate;
    private VehicleSize vehicleSize;


    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    protected void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    abstract int calculateParkingFee(int parkingDuration);

}
