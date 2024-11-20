public class OrderManager {
    private Cart cart = new Cart();

    public void addProductToCart(Product product) {
        cart.addProduct(product);
    }

    public void checkout() {
        System.out.println("Заказ оформлен.");
        cart.showCart();
        cart.clearCart();
    }
}
