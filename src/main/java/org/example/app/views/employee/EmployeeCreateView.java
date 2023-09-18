package org.example.app.views.employee;

public class EmployeeCreateView extends CreateView {
    @Override
    public String[] getData() {

        String firstName = getUserInput("Enter first name: ");
        String lastName = getUserInput("Enter last name: ");
        String birthDate = getUserInput("Enter birth date in format YYYY-MM-DD: ");
        String positionId = getUserInput("Enter position Id: ");
        String phone = getUserInput("Enter phone in format xxx xxx-xxx: ");
        String salary = getUserInput("Enter salary: ");

        return new String[]{firstName, lastName, birthDate, positionId, phone, salary};
    }
}

