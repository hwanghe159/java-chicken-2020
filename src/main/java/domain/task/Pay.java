package domain.task;

public class Pay implements Task {
    private final TaskType type;

    public Pay(TaskType type) {
        this.type = type;
    }

    @Override
    public void execute() {

    }
}
