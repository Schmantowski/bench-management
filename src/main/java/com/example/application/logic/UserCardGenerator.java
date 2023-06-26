package com.example.application.logic;

import com.example.application.components.UserCard;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class UserCardGenerator {
    // Just for test purposes
    public static HorizontalLayout getUserCardHorizontalLayoutWithData(){
        HorizontalLayout result = new HorizontalLayout();

        UserCard moon = new UserCard("moon");
        moon.setUserDetails("Only visible at night");
        UserCard sun = new UserCard("sun");
        sun.setUserDetails("Only visible at day");
        UserCard earth = new UserCard("earth");
        earth.setUserDetails("The pleace we all know and love");

        result.add(sun, moon, earth);

        return result;
    }
}
