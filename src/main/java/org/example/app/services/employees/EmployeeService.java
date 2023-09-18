package org.example.app.services.employees;

import org.example.app.controllers.employee.OperationController;
import org.example.app.entities.Employee;
import org.example.app.repositories.BaseRepository;
import org.example.app.repositories.employee.EmployeeRepository;
import org.example.app.views.employee.CreateView;
import org.example.app.views.employee.EmployeeCreateView;

public class EmployeeService extends BaseService<Employee> {

    @Override
    protected OperationController<Employee> getController() {
        CreateView view = new EmployeeCreateView();
        BaseRepository<Employee> repository = new EmployeeRepository();
        OperationService<Employee> service = new EmployeeOperationService(repository);
        return new OperationController<>(service, view);
    }

}