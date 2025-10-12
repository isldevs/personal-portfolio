package com.base.views;


import com.base.components.HeaderSection;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author YISivlay
 */
@Route("project")
public class ProjectView extends VerticalLayout {

    public ProjectView() {
        setSizeFull();
        setPadding(true);
        getStyle().set("background-color", "#000000");

        add(new HeaderSection());

        H2 title = new H2("Projects");
        title.getStyle().set("color", "white")
                .set("font-family", "'Fira Code', 'JetBrains Mono', monospace");

        Paragraph p1 = new Paragraph("Attendance Sync System - Sync attendance from fingerprint devices.");
        Paragraph p2 = new Paragraph("Telegram Invoice Bot - Automatically sends invoice after purchase.");

        for (Paragraph p : new Paragraph[]{p1, p2}) {
            p.getStyle().set("color", "#cccccc")
                    .set("font-family", "'Fira Code', monospace");
        }

        add(title, p1, p2);
    }
}
