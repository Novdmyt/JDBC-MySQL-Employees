package org.example.app.controllers;

import org.example.app.services.AppService;
import org.example.app.utils.Constants;
import org.example.app.utils.OptionChecker;
import org.example.app.views.employee.OptionView;

public class AppController {

    OptionView view;
    AppService service;

    public AppController(OptionView view, AppService service) {
        this.view = view;
        this.service = service;
    }

    public void runApp() {
        filterChoice(view.chooseOption());
    }

    private void filterChoice(int choice) {
        switch (choice) {
            case 1 -> service.getPositions();
            case 2 -> service.getEmployees();
            case 0 -> view.getOutput(Constants.APP_CLOSE_MSG);
            default -> OptionChecker.getNoSuchOption(choice);
        }
    }
}