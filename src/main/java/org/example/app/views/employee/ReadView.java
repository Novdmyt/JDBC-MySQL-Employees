package org.example.app.views.employee;

import org.example.app.views.View;

public class ReadView implements View {

    @Override
    public void getOutput(String output) {
        System.out.println(output);
    }
}
