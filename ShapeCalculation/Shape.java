package ShapeCalculation;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
