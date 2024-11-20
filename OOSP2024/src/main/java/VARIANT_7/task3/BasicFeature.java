public class BasicFeature extends Feature {
    public BasicFeature(Device device) {
        super(device);
    }

    @Override
    public void enableFeature() {
        System.out.println("Включена базовая функция.");
        device.operate();
    }
}
