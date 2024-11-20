import java.util.Scanner;

public class StorageManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите устройство для работы: USB или SD?");
        String choice = scanner.nextLine();

        StorageDevice device;
        if (choice.equalsIgnoreCase("USB")) {
            device = new ExternalStorageAdapter(new UsbDrive());
        } else if (choice.equalsIgnoreCase("SD")) {
            device = new ExternalStorageAdapter(new SdCard());
        } else {
            System.out.println("Неверный выбор!");
            return;
        }

        device.readData();
        device.writeData("Пример данных");
    }
}
