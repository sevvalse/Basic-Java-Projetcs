package ShapeCalculation;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Shape2D> shapes2d = new ArrayList<>();
        ArrayList<Shape3D> shapes3d = new ArrayList<>();

        Circle circle = new Circle("c", 5);
        Square square = new Square("s", 7);
        Cone cone = new Cone("co", 4, 1);
        Cube cube = new Cube("cube", 8.0);

        shapes3d.add(cube);
        shapes3d.add(cone);
        shapes2d.add(circle);
        shapes2d.add(square);

        for(Shape2D shape : shapes2d) {
            System.out.println(shape.toString());
        }

        for(Shape3D shape : shapes3d) {
            System.out.println(shape.toString());
        }

    }
}
