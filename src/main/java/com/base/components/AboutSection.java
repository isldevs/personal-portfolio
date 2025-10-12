package com.base.components;


import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;

/**
 * @author YISivlay
 */
public class AboutSection extends VerticalLayout {
    public AboutSection() {
        setId("about"); // for smooth scroll
        setWidthFull();
        setPadding(true);
        setSpacing(true);

        String codingFont = "'Fira Code', 'JetBrains Mono', monospace";

        HorizontalLayout titleLayout = new HorizontalLayout();
        titleLayout.setWidthFull();
        titleLayout.setJustifyContentMode(JustifyContentMode.CENTER);

        H2 title = new H2("About Me");
        title.getStyle()
                .set("color", "white")
                .set("font-family", codingFont);

        titleLayout.add(title);

        Paragraph aboutContent = new Paragraph(
                "Hi, I'm Sivlay Yi, a backend developer specializing in Java and Spring Boot. "
                        + "I have hands-on experience building scalable backend systems, RESTful APIs, "
                        + "microservices, and deploying applications with Docker and cloud services. "
                        + "I am passionate about clean code, software architecture, and creating reliable solutions for businesses and government systems."
        );
        aboutContent.getStyle()
                .set("color", "#cccccc")
                .set("font-family", codingFont)
                .set("line-height", "1.5em");

        add(titleLayout, aboutContent);
    }
}
