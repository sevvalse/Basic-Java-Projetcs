package Lab_6;

import java.util.ArrayList;

public class CarPark {
    ArrayList<Vehicle> parkedVehicles;
    int capacity;
    int totalEarnings;


    public CarPark(int capacity) {
        this.parkedVehicles = new ArrayList<>();
        this.capacity = capacity;
        this.totalEarnings = 0;
    }
    
    void parkVehicle(Vehicle vehicle) {
        if (this.capacity >= vehicle.getVehicleSize().size()) {
            this.parkedVehicles.add(vehicle);
            this.capacity -= vehicle.getVehicleSize().size();
        }
        else {
            System.out.println("Vehicle Capacity Exceeded");
        }
    }

    public String toString(){
        return "Capacity: " + capacity + "\nTotal Earnings: " + totalEarnings;
    }

    void releaseVehicle(Vehicle vehicle, int duration) {
        this.parkedVehicles.remove(vehicle);
        this.capacity += vehicle.getVehicleSize().size();
        this.totalEarnings += vehicle.calculateParkingFee(duration);
    }

}
