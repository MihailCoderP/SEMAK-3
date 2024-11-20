import java.util.Scanner;

public class ZooSimulator {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в симулятор зоопарка!");
        System.out.print("Введите тип животного (лев, тигр, зебра): ");
        String animalType = scanner.nextLine();

        try {
            Animal animal = factory.createAnimal(animalType);
            animal.makeSound();
            animal.move();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
