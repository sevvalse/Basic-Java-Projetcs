package ShapeCalculation;

public abstract class Shape3D extends Shape implements AreaCalculation, VolumeCalculation {

    public Shape3D(String name) {
        super(name);
    }
}
