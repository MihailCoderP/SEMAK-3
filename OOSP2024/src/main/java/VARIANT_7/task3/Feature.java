public abstract class Feature {
    protected Device device;

    public Feature(Device device) {
        this.device = device;
    }

    public abstract void enableFeature();
}
