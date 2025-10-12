package com.base.views;


import com.base.components.HeaderSection;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author YISivlay
 */
@Route("experience")
public class ExperienceView extends VerticalLayout {

    public ExperienceView() {
        setSizeFull();
        setPadding(true);
        getStyle().set("background-color", "#000000");

        add(new HeaderSection());

        H2 title = new H2("Experience");
        title.getStyle().set("color", "white")
                .set("font-family", "'Fira Code', 'JetBrains Mono', monospace");

        Paragraph exp1 = new Paragraph("Backend Developer at XYZ Company (2018-Present)");
        exp1.getStyle().set("color", "#cccccc").set("font-family", "'Fira Code', monospace");

        Paragraph exp2 = new Paragraph("Intern at ABC Tech (2022-2023)");
        exp2.getStyle().set("color", "#cccccc").set("font-family", "'Fira Code', monospace");

        add(title, exp1, exp2);
    }
}
