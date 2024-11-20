public class SdCard implements StorageDevice {
    @Override
    public void readData() {
        System.out.println("Чтение данных с SD-карты.");
    }

    @Override
    public void writeData(String data) {
        System.out.println("Запись данных на SD-карту: " + data);
    }
}
