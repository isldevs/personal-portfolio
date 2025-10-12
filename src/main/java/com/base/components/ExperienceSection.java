package com.base.components;


import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * @author YISivlay
 */
public class ExperienceSection extends VerticalLayout {
    public ExperienceSection() {
        setId("experience");
        setPadding(true);
        setSpacing(true);
        setWidthFull();

        String codingFont = "'Fira Code', 'JetBrains Mono', monospace";

        H2 title = new H2("Work Experience");
        title.getStyle().set("color", "white").set("font-family", codingFont);

        VerticalLayout experienceList = new VerticalLayout();
        experienceList.setPadding(false);
        experienceList.setSpacing(false);

        // Example: Backend Developer
        Span job1 = new Span("Cam Info Services — Backend Developer (Jul 2018 - Present)");
        job1.getStyle().set("color", "#cccccc").set("font-family", codingFont).set("font-weight", "bold");

        UnorderedList items1 = new UnorderedList();
        items1.getStyle().set("color", "#cccccc").set("font-family", codingFont);
        items1.add(new ListItem("Developed backend systems using Java and Spring Boot with RESTful APIs."));
        items1.add(new ListItem("Optimized relational databases with MySQL/PostgreSQL."));
        items1.add(new ListItem("Integrated Spring Data JPA and Hibernate for maintainable database access."));

        // Java Intern
        Span job2 = new Span("Cam Info Services — Java Programmer Intern (Mar 2018 - May 2018)");
        job2.getStyle().set("color", "#cccccc").set("font-family", codingFont).set("font-weight", "bold");

        UnorderedList items2 = new UnorderedList();
        items2.getStyle().set("color", "#cccccc").set("font-family", codingFont);
        items2.add(new ListItem("Assisted in backend development with Java and Spring Boot."));
        items2.add(new ListItem("Supported database operations and wrote SQL queries."));

        experienceList.add(job1, items1, job2, items2);
        add(title, experienceList);
    }
}
