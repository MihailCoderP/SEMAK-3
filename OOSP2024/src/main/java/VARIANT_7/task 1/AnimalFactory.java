public class AnimalFactory {
    public Animal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "лев":
                return new Lion();
            case "тигр":
                return new Tiger();
            case "зебра":
                return new Zebra();
            default:
                throw new IllegalArgumentException("Неизвестный тип животного: " + type);
        }
    }
}
