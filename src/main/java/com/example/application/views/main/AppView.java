package com.example.application.views.main;

import com.example.application.logic.UserCardGenerator;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

@Route("")
public class AppView extends AppLayout {
    public AppView() {
        H1 title = new H1("Bench Management");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("left", "var(--lumo-space-l)").set("margin", "0")
                .set("position", "absolute");

        // Tabs
        Tabs tabs = getTabs();
        tabs.getStyle().set("margin", "0 auto");
        addToNavbar(createTopBar(title, tabs));

        // Add Item Icon
        Icon plusIcon = new Icon("lumo", "plus");
        plusIcon.addClassName("plus-icon");

        // content
        FlexLayout contentLayout = new FlexLayout(UserCardGenerator.getUserCardHorizontalLayoutWithData(), plusIcon);
        contentLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        setContent(contentLayout);

    }

    private FlexLayout createTopBar(H1 title, Tabs tabs) {
        FlexLayout topBar = new FlexLayout();
        topBar.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        topBar.setAlignItems(FlexComponent.Alignment.CENTER);
        topBar.setWidthFull();
        topBar.getStyle().set("padding", "var(--lumo-space-l)");

        topBar.add(title, tabs);

        return topBar;
    }

    private Tabs getTabs(){
        Tab candidates = new Tab();
        candidates.setLabel("Kandidaten");

        Tab notes = new Tab();
        notes.setLabel("Notizen");


        Tabs tabs = new Tabs();
        tabs.add(candidates);
        tabs.add(notes);

        return tabs;
    }
}
