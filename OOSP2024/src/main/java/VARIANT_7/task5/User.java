public class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " получил уведомление: " + news);
    }
}
