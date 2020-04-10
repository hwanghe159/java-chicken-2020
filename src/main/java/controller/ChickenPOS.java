package controller;

import domain.Menu;
import domain.Table;
import domain.task.TaskType;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Stack;

public class ChickenPOS {
    final List<Table> tables;
    final List<Menu> menus;

    public ChickenPOS(List<Table> tables, List<Menu> menus) {
        this.tables = tables;
        this.menus = menus;
    }

    public void execute() {
        TaskType type = chooseTaskType();
        if (type.isOrder()) {
            order();
        }
        if (type.isPay()) {
            pay();
        }
        if (type.isExit()) {
            exit();
        }
    }

    private TaskType chooseTaskType() {
        try {
            OutputView.printMainDisplay();
            return TaskType.of(InputView.inputTaskNumber());
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
            return chooseTaskType();
        }
    }

    private void order() {
        OutputView.printTables(tables);
        InputView.inputTableNumber();
    }

    private void pay() {

    }

    private void exit(){

    }
}
