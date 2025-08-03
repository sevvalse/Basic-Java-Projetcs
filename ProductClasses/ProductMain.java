package Lab_5;

public class ProductMain {
    public static void main(String[] args) {
        ElectronicProduct ep = new ElectronicProduct("Samsung", "Galaxy S21", 2, 1, "Smartphone", 15000.0, "Latest model smartphone");
        BookProduct bp = new BookProduct("George Orwell", "Dystopian", 328, 2, "1984", 200.0, "Classic novel");

        System.out.println("Electronic Product: " + ep.getName() + ", Tax: " + ep.getTax());
        System.out.println("Book Product: " + bp.getName() + ", Tax: " + bp.getTax());
    }
}
