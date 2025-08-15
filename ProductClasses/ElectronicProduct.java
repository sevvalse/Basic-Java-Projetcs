package ProductClasses;

public class ElectronicProduct extends Product {
    String Manufacturer;
    String Model;
    int Warranty;

    public ElectronicProduct(String Manufacturer, String Model, int Warranty, int ID, String Name, double Price, String Description) {
        super(ID, Name, Price, Description);
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.Warranty = Warranty;

    }
    String getManufacturer() {
        return Manufacturer;
    }

    String getModel() {
        return Model;
    }

    int getWarranty() {
        return Warranty;
    }

    @Override
    double getTax() {
        return getPrice()*20/100;
    }
}
