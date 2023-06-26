package com.example.application.components;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class UserCard extends Div {
    private Text name;
    private TextField detailsField;

    public UserCard(String userName) {
        name = new Text(userName);
        //name.getStyle().set("font-weight", "bold");

        detailsField = new TextField("Detail");

        addClassName("user-card");

        add(new VerticalLayout(name, detailsField));
    }

    public void setUserName(String userName) {
        name.setText(userName);
    }

    public String getUserName() {
        return name.getText();
    }

    public void setUserDetails(String userDetails) {
        detailsField.setValue(userDetails);
    }

    public String getUserDetails() {
        return detailsField.getValue();
    }
}

