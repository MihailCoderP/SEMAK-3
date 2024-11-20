import java.util.List;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Написать код");
        Task task2 = new Task("Проверить задачи");
        Task task3 = new Task("Отправить отчет");

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        System.out.println("Список задач:");
        manager.showTasks();

        System.out.println("\nСохраняем текущее состояние...");
        List<Task> savedState = manager.saveState();

        System.out.println("\nОбновляем задачи...");
        task1.complete();
        manager.removeTask(task3);
        manager.showTasks();

        System.out.println("\nВосстанавливаем состояние...");
        manager.restoreState(savedState);
        manager.showTasks();
    }
}
