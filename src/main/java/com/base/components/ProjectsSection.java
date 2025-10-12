package com.base.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * @author YISivlay
 */
public class ProjectsSection extends VerticalLayout {
    public ProjectsSection() {
        setId("projects");
        setPadding(true);
        setSpacing(true);
        setWidthFull();

        String codingFont = "'Fira Code', 'JetBrains Mono', monospace";

        HorizontalLayout titleLayout = new HorizontalLayout();
        titleLayout.setWidthFull();
        titleLayout.setJustifyContentMode(JustifyContentMode.CENTER);

        H2 title = new H2("Projects");
        title.getStyle().set("color", "white").set("font-family", codingFont);

        titleLayout.add(title);

        VerticalLayout projectList = new VerticalLayout();
        projectList.setPadding(false);
        projectList.setSpacing(false);

        addProject(projectList, "iSLDevs", "Java 25 | Spring Boot 3.5.6 | PostgreSQL | OAuth2 | Docker",
                "https://github.com/isldevs/isldevs");
        addProject(projectList, "Attendance Sync", "Java | Spring Boot | Fingerprint Device | MySQL",
                "https://github.com/isldevs/attendance-sync");
        addProject(projectList, "Telegram Bot Invoice Notifier", "Java | Spring Boot | Telegram API",
                "https://github.com/isldevs/telegrambot");

        add(titleLayout, projectList);
    }

    private void addProject(VerticalLayout layout, String name, String tech, String url) {
        String codingFont = "'Fira Code', 'JetBrains Mono', monospace";

        Span projectName = new Span(name);
        projectName.getStyle().set("color", "white").set("font-family", codingFont).set("font-weight", "bold");

        Span projectTech = new Span(tech);
        projectTech.getStyle().set("color", "#cccccc").set("font-family", codingFont);

        Button projectLink = new Button("View Source");
        projectLink.getStyle().set("background-color", "transparent").set("color", "lightblue").set("border", "none");
        projectLink.addClickListener(e -> projectLink.getUI().ifPresent(ui -> ui.getPage().open(url)));

        layout.add(projectName, projectTech, projectLink);
    }
}
