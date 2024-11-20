import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void showTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public List<Task> saveState() {
        return new ArrayList<>(tasks);
    }

    public void restoreState(List<Task> savedState) {
        tasks = new ArrayList<>(savedState);
    }
}
