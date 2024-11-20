public class Speaker implements AudioDevice {
    @Override
    public void playSound() {
        System.out.println("Звук воспроизводится через колонки.");
    }
}
