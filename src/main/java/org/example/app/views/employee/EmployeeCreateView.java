package org.example.app.views.employee;

public class EmployeeCreateView extends CreateView {
    @Override
    public String[] getData() {
        String positionId = getUserInput("Enter position Id: ");
        String firstName = getUserInput("Enter first name: ");
        String lastName = getUserInput("Enter last name: ");
        String birthDate = getUserInput("Enter birth date in format YYYY-MM-DD: ");
        String phone = getUserInput("Enter phone in format xxx xxx-xxxx: ");
        String salary = getUserInput("Enter salary: ");

        return new String[]{positionId, firstName, lastName, birthDate,  phone, salary};
    }
}

