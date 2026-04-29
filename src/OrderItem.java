import java.util.ArrayList;

public class OrderItem extends Products{

    private int quantity;
    private ArrayList<Products> products;

    public OrderItem(String type, double price, String description, int quantity) {
        super(type, price, description);
        this.quantity = quantity;
        this.products = new ArrayList<>();
    }


    @Override
    public void showDetails() {

    }
}
