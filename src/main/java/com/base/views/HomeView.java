package com.base.views;

import com.base.components.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {
        setSizeFull();
        setPadding(false);
        setSpacing(false);
        getStyle().set("background-color", "#000000")
                .set("overflow", "auto");

        add(
                new HeaderSection(),
                new HomeSection(),
                new FooterSection()
        );
    }
}
