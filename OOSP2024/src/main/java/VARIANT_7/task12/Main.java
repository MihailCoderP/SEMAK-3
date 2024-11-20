public class GeoApp {
    public static void main(String[] args) {
        City city1 = new City("Москва");
        City city2 = new City("Санкт-Петербург");

        Region region = new Region("Центральный регион");
        region.addComponent(city1);
        region.addComponent(city2);

        region.display();
    }
}
