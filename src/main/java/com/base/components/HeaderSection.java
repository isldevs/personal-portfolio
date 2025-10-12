package com.base.components;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * @author YISivlay
 */
public class HeaderSection extends HorizontalLayout {
    public HeaderSection() {
        setWidthFull();
        setHeight("80px");
        setPadding(true);
        setAlignItems(FlexComponent.Alignment.CENTER);
        setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
        getStyle().set("background-color", "#000000");

        String defaultFont = "'Fira Code', 'JetBrains Mono', 'Courier New', monospace";

        Span name = new Span("Sivlay");
        name.getStyle().set("color", "white")
                .set("font-size", "1.5em")
                .set("font-weight", "bold")
                .set("font-family", defaultFont)
                .set("margin", "0");

        HorizontalLayout navLayout = new HorizontalLayout();
        navLayout.setSpacing(true);

        Button homeButton = createNavButton("Home", "", defaultFont);
        Button aboutButton = createNavButton("About", "about", defaultFont);
        Button experienceButton = createNavButton("Experience", "experience", defaultFont);
        Button skillButton = createNavButton("Skill", "skill", defaultFont);
        Button projectButton = createNavButton("Project", "project", defaultFont);
        Button contactButton = createNavButton("Contact", "contact", defaultFont);

        navLayout.add(homeButton, aboutButton, experienceButton, skillButton, projectButton, contactButton);

        add(name, navLayout);
    }

    private Button createNavButton(String text, String route, String fontFamily) {
        Button button = new Button(text, e -> UI.getCurrent().navigate(route));
        button.getStyle().set("background-color", "transparent")
                .set("color", "white")
                .set("border", "none")
                .set("cursor", "pointer")
                .set("font-size", "1em")
                .set("font-family", fontFamily);
        return button;
    }
}

