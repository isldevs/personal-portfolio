package com.base.components;


import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * @author YISivlay
 */
public class SkillSection extends VerticalLayout {
    public SkillSection() {
        setId("skills");
        setPadding(true);
        setSpacing(true);
        setWidthFull();

        String codingFont = "'Fira Code', 'JetBrains Mono', monospace";

        HorizontalLayout titleLayout = new HorizontalLayout();
        titleLayout.setWidthFull();
        titleLayout.setJustifyContentMode(JustifyContentMode.CENTER);

        H2 title = new H2("Technical Skills");
        title.getStyle().set("color", "white").set("font-family", codingFont);

        titleLayout.add(title);

        UnorderedList skills = new UnorderedList();
        skills.getStyle().set("color", "#cccccc").set("font-family", codingFont);
        skills.add(new ListItem("Languages: Java, C, C++, SQL, Bash"));
        skills.add(new ListItem("Frameworks: Spring Boot, Spring Security, Hibernate, REST APIs"));
        skills.add(new ListItem("Databases: PostgreSQL, MySQL, MongoDB, Redis"));
        skills.add(new ListItem("Cloud & DevOps: AWS, Docker, Git, Jenkins, Flyway"));
        skills.add(new ListItem("Other: OAuth2, JWT, Microservices, CI/CD, Unit Testing (JUnit, Mockito)"));

        add(titleLayout, skills);
    }
}
