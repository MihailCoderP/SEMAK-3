public class StoreApp {
    public static void main(String[] args) {
        StoreFacade store = new StoreFacade();

        store.buyProduct("Телефон", 25000);
        store.buyProduct("Ноутбук", 75000);
        store.completePurchase();
    }
}
