package Lab_5;

public class BookProduct extends Product {
    String Author;
    String Genre;
    int NumberofPages;

    public BookProduct(String Author, String Genre, int NumberofPages, int ID, String Name, double Price, String Description) {
        super(ID, Name, Price, Description);
        this.Author = Author;
        this.Genre = Genre;
        this.NumberofPages = NumberofPages;

    }

    double getTax() {
        return getPrice()*20/100;
    }
}
