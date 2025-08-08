package Lab_7;

public class Square extends Shape2D{
    private double x;

    public Square(String name, double x) {
        super(name);
        this.x = x;
    }

    @Override
    public double calculatePerimeter() {
        return 4*x;
    }

    @Override
    public double calculateArea() {
        return x*x;
    }
}
