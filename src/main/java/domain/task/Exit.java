package domain.task;

public class Exit implements Task {
    @Override
    public void execute() {
        //TODO: 종료메시지
        System.exit(0);
    }
}
