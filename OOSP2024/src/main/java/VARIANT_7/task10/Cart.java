import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product + " добавлен в корзину.");
    }

    public void showCart() {
        System.out.println("Корзина:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void clearCart() {
        products.clear();
        System.out.println("Корзина очищена.");
    }
}
