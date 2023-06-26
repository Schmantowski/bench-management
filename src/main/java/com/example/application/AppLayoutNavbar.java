package com.example.application;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.tabs.Tabs;

public class AppLayoutNavbar extends AppLayout {

    public AppLayoutNavbar() {
        H1 title = new H1("MyApp");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("left", "var(--lumo-space-l)").set("margin", "0")
                .set("position", "absolute");

        Tabs tabs = getTabs();

        addToNavbar(title, tabs);
    }

    private Tabs getTabs(){
        return new Tabs();
    }
}