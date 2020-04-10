package controller;

import domain.*;
import domain.task.TaskType;
import view.InputView;
import view.OutputView;

import java.util.NoSuchElementException;

public class ChickenPOS {
    final Tables totalTables;
    final Menus totalMenus;

    public ChickenPOS(Tables tables, Menus menus) {
        this.totalTables = tables;
        this.totalMenus = menus;
    }

    public void execute() {
        TaskType type = chooseTaskType();
        if (type.isOrder()) {
            OutputView.printTables(totalTables.getTables());
            order();
        }
        if (type.isPay()) {
            OutputView.printTables(totalTables.getTables());
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
        try {
            totalTables.update(chooseTable(), chooseMenu(), InputView.inputMenuAmount());
        } catch (IllegalArgumentException | NoSuchElementException e) {
            OutputView.printErrorMessage(e.getMessage());
            order();
        }
    }

    private Table chooseTable() {
        try {
            return totalTables.of(InputView.inputTableNumber());
        } catch (NoSuchElementException e) {
            OutputView.printErrorMessage(e.getMessage());
            return chooseTable();
        }
    }

    private Menu chooseMenu() {
        try {
            OutputView.printMenus(totalMenus.getMenus());
            return totalMenus.of(InputView.inputMenuNumber());
        } catch (NoSuchElementException e) {
            OutputView.printErrorMessage(e.getMessage());
            return chooseMenu();
        }
    }

    private void pay() {

    }

    private void exit() {

    }
}
