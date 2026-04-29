public abstract class Product extends Store{

    private String type;
    private double price;
    private  String description;

    public Product (String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {

    }

    public abstract void showDetails();
}
