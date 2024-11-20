public class ThreadManagerApp {
    public static void main(String[] args) {
        ThreadManager manager = new ThreadManager(3);

        manager.executeTask(new AsyncTask("Задача 1"));
        manager.executeTask(new AsyncTask("Задача 2"));
        manager.executeTask(new AsyncTask("Задача 3"));
        manager.executeTask(new AsyncTask("Задача 4"));

        manager.shutdown();
    }
}
