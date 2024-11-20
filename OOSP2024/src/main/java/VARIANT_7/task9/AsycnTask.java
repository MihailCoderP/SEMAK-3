public class AsyncTask implements Runnable {
    private String name;

    public AsyncTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " выполняется...");
        try {
            Thread.sleep(1000); // Симуляция работы
        } catch (InterruptedException e) {
            System.out.println(name + " был прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
