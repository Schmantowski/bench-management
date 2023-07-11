package com.example.application.components;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class UserCard extends Div {
    private Text name;
    private TextField detailsField;

    private Icon deleteCardIcon;

    public UserCard(String userName) {
        addClassName("user-card");
        name = new Text(userName);
        detailsField = new TextField("Detail");

        deleteCardIcon = new Icon("lumo", "cross");
        deleteCardIcon.addClassName("delete-card-icon");

        add(deleteCardIcon, new VerticalLayout(name, detailsField));

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

