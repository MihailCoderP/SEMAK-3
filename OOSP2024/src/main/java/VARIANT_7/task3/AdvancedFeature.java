public class AdvancedFeature extends Feature {
    public AdvancedFeature(Device device) {
        super(device);
    }

    @Override
    public void enableFeature() {
        System.out.println("Включена расширенная функция с дополнительными настройками.");
        device.operate();
    }
}
