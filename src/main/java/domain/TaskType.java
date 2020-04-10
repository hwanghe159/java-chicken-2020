package domain;

import java.util.Arrays;

public enum TaskType {
    ORDER(1),
    PAY(2),
    EXIT(3);

    private final int taskTypeNumber;

    TaskType(int taskNumber) {
        this.taskTypeNumber = taskNumber;
    }

    public static TaskType of(int taskTypeNumber) {
        return Arrays.stream(values())
                .filter(task -> task.taskTypeNumber == taskTypeNumber)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("해당 번호에 대응하는 기능이 존재하지 않습니다."));
    }
}
