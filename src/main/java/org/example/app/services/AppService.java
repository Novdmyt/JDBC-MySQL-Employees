package org.example.app.services;

import org.example.app.controllers.employee.EntityController;
import org.example.app.controllers.positions.PositionController;
import org.example.app.entities.Employee;
import org.example.app.exceptions.OptionException;
import org.example.app.services.employees.BaseService;
import org.example.app.services.employees.EmployeeService;
import org.example.app.services.positions.PositionService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.utils.StringFormatter;
import org.example.app.views.employee.OptionView;
import org.example.app.views.positions.PositionView;

public class AppService {

    public void getPositions() {
        PositionView view = new PositionView();
        PositionService service = new PositionService();
        PositionController controller = new PositionController(view, service);
        controller.runPositions();
    }

    public void getEmployees() {
        OptionView view = createView(Constants.TABLE_EMPLOYEES);
        BaseService<Employee> service = new EmployeeService();
        EntityController<Employee> controller = new EntityController<>(view, service);
        controller.run();
    }
    private OptionView createView(String tableName) {
        return new OptionView(StringFormatter.capitalize(tableName),
                "Create a new "  + StringFormatter.removeLast(tableName),
                "View " + tableName);
    }

    public void getNoSuchOption(int choice) {
        int[] menuChoices = {0, 1, 2};
        if (!hasOption(menuChoices, choice)) {
            try {
                throw new OptionException(Constants.INCORRECT_VALUE_MSG);
            } catch (OptionException e) {
                System.out.println(e.getMessage());
                AppStarter.startApp();
            }
        }
    }

    public static boolean hasOption(final int[] options, final int value) {
        boolean result = false;
        for (int i : options) {
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}
