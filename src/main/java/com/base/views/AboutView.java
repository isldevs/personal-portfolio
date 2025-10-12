package com.base.views;


import com.base.components.HeaderSection;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author YISivlay
 */
@Route("about")
public class AboutView extends VerticalLayout {

    public AboutView() {
        setSizeFull();
        setPadding(true);
        getStyle().set("background-color", "#000000");

        add(new HeaderSection());

        H2 title = new H2("About Me");
        title.getStyle().set("color", "white")
                .set("font-family", "'Fira Code', 'JetBrains Mono', monospace");

        Paragraph bio = new Paragraph(
                "I’m a backend developer specializing in Java and Spring Boot. " +
                        "I enjoy building efficient, scalable, and maintainable applications."
        );
        bio.getStyle().set("color", "#cccccc")
                .set("font-family", "'Fira Code', 'JetBrains Mono', monospace");

        add(title, bio);
    }
}