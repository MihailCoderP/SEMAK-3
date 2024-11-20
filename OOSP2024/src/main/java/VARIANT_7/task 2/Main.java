import java.util.Scanner;

public class AudioManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип устройств: проводные или беспроводные?");
        String choice = scanner.nextLine();

        AudioDeviceFactory factory;
        if (choice.equalsIgnoreCase("проводные")) {
            factory = new WiredDeviceFactory();
        } else if (choice.equalsIgnoreCase("беспроводные")) {
            factory = new WirelessDeviceFactory();
        } else {
            System.out.println("Неверный выбор!");
            return;
        }

        AudioDevice headphones = factory.createHeadphones();
        AudioDevice speaker = factory.createSpeaker();
        AudioDevice microphone = factory.createMicrophone();

        headphones.playSound();
        speaker.playSound();
        microphone.playSound();
    }
}
