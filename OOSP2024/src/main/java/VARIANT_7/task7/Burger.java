public class Burger {
    private String bun;
    private String patty;
    private String toppings;
    private String sauce;

    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.toppings = builder.toppings;
        this.sauce = builder.sauce;
    }

    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private String toppings;
        private String sauce;

        public BurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public BurgerBuilder setToppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }

    @Override
    public String toString() {
        return "Бургер: булочка = " + bun + ", котлета = " + patty + ", топпинги = " + toppings + ", соус = " + sauce;
    }
}
