package Lab_1;

public class Employee {
    int id;
    String name;
    String position;
    double salary;

    Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        String st = id + "," + name + "," + position + "," + salary;
        return st;
    }
}
