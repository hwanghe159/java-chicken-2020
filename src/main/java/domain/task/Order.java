package domain.task;

public class Order implements Task {
    private final TaskType type;

    public Order(TaskType type) {
        this.type = type;
    }

    @Override
    public void execute() {

    }
}
