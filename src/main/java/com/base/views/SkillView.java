package com.base.views;


import com.base.components.HeaderSection;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author YISivlay
 */
@Route("skill")
public class SkillView extends VerticalLayout {

    public SkillView() {
        setSizeFull();
        setPadding(true);
        getStyle().set("background-color", "#000000");

        add(new HeaderSection());

        H2 title = new H2("Skills");
        title.getStyle().set("color", "white")
                .set("font-family", "'Fira Code', 'JetBrains Mono', monospace");

        Paragraph skills = new Paragraph("Java, Spring Boot, Vaadin, SQL, Git, Docker, REST APIs");
        skills.getStyle().set("color", "#cccccc")
                .set("font-family", "'Fira Code', 'JetBrains Mono', monospace");

        add(title, skills);
    }
}
