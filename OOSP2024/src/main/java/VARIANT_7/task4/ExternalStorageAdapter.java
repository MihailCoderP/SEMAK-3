public class ExternalStorageAdapter implements StorageDevice {
    private final StorageDevice storageDevice;

    public ExternalStorageAdapter(StorageDevice storageDevice) {
        this.storageDevice = storageDevice;
    }

    @Override
    public void readData() {
        storageDevice.readData();
    }

    @Override
    public void writeData(String data) {
        storageDevice.writeData(data);
    }
}
