package ShapeCalculation;

public class Cube extends Shape3D{
    Double x;

    public Cube(String name, Double x) {
        super(name);
        this.x = x;
    }

    public double calculateArea() {
        return 6*x*x;
    }

    public double calculateVolume() {
        return x*x*x;
    }
}
