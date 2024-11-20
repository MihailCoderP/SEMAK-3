import java.util.ArrayList;
import java.util.List;

public class Region implements GeoComponent {
    private String name;
    private List<GeoComponent> components = new ArrayList<>();

    public Region(String name) {
        this.name = name;
    }

    public void addComponent(GeoComponent component) {
        components.add(component);
    }

    public void removeComponent(GeoComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Регион: " + name);
        for (GeoComponent component : components) {
            component.display();
        }
    }
}
