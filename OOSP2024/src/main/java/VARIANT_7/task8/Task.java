public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void complete() {
        isCompleted = true;
    }

    public void uncomplete() {
        isCompleted = false;
    }

    @Override
    public String toString() {
        return description + (isCompleted ? " (выполнено)" : " (не выполнено)");
    }
}
