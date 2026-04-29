import java.util.ArrayList;

public abstract class Store {
    private ArrayList<Product> products;
    private ArrayList<OrderItem> orderItems;


    public Store(ArrayList<Product> products, ArrayList<OrderItem> orderItems) {
        this.products = products;
        this.orderItems = orderItems;
    }

    public void addItem(Product product) {
        products.add(product);
    }
}
