package Lab_5;

abstract class Product {
    int ID;
    String Name;
    double Price;
    String Description;


    public Product(int ID, String Name, double Price, String Description) {
        this.ID = ID;
        this.Name = Name;
        this.Price = Price;
        this.Description = Description;
    }

    int getID() {
        return ID;
    }

    String getName() {
        return Name;
    }

    double getPrice() {
        return Price;
    }

    String getDescription() {
        return Description;
    }

    abstract double getTax();

}
