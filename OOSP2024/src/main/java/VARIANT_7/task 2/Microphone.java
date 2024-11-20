public class Microphone implements AudioDevice {
    @Override
    public void playSound() {
        System.out.println("Звук записывается через микрофон.");
    }
}
