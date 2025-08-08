package Lab_7;

public class Cone extends Shape3D{
    double radius;
    double height;

    public Cone(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    public double calculateArea() {
        return Math.PI * radius * radius + Math.PI * Math.sqrt((radius*radius) + (height*height)) * radius;
    }

    public double calculateVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}
