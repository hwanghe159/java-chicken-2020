package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String CHOOSE_TASK_NUMBER_MESSAGE = "## 원하는 기능을 선택하세요.";
    private static final String CHOOSE_TABLE_NUMBER_MESSAGE = "## 주문할 테이블을 선택하세요.";

    public static int inputTaskNumber() {
        System.out.println(CHOOSE_TASK_NUMBER_MESSAGE);
        return scanner.nextInt();
    }

    public static int inputTableNumber() {
        System.out.println(CHOOSE_TABLE_NUMBER_MESSAGE);
        return scanner.nextInt();
    }
}
