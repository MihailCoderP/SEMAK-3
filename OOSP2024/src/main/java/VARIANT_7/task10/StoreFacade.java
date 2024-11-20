public class StoreFacade {
    private OrderManager orderManager = new OrderManager();

    public void buyProduct(String productName, double price) {
        Product product = new Product(productName, price);
        orderManager.addProductToCart(product);
    }

    public void completePurchase() {
        orderManager.checkout();
    }
}
