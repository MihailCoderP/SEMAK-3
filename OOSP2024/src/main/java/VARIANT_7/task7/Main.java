public class BurgerManager {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .setBun("Цельнозерновая")
                .setPatty("Говяжья")
                .setToppings("Сыр, Лук")
                .setSauce("Барбекю")
                .build();

        System.out.println(burger);
    }
}
