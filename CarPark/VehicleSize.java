package Lab_6;

public enum VehicleSize {
    SMALL,
    MEDIUM,
    LARGE;

    int size(){
        if (this == VehicleSize.SMALL){
            return 1;
        }
        else if (this == VehicleSize.MEDIUM){
            return 2;
        }
        else {
            return 3;
        }
    }
}
