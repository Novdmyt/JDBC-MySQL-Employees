package org.example.app.services.employees;

import org.example.app.controllers.employee.OperationController;
public abstract class BaseService<T> {

    private final OperationController<T> controller;

    public BaseService() {
        controller = getController();
    }

    protected abstract OperationController<T> getController();

    public void create() {
        controller.create();
    }

    public void read() {
        controller.read();
    }
}
