import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadManager {
    private ExecutorService executor;

    public ThreadManager(int threadCount) {
        executor = Executors.newFixedThreadPool(threadCount);
    }

    public void executeTask(AsyncTask task) {
        executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
        System.out.println("Все потоки завершены.");
    }
}
