public class City implements GeoComponent {
    private String name;

    public City(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Город: " + name);
    }
}
