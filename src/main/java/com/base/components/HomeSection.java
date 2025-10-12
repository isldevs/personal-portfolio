package com.base.components;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * @author YISivlay
 */
public class HomeSection extends VerticalLayout {
    public HomeSection() {
        setId("home");
        setWidthFull();
        setPadding(true);
        setSpacing(true);
        setAlignItems(FlexComponent.Alignment.CENTER);

        String codingFont = "'Fira Code', 'JetBrains Mono', monospace";

        H1 name = new H1("Sivlay Yi");
        name.getStyle().set("color", "white")
                .set("font-family", codingFont)
                .set("font-size", "3em");

        Paragraph role = new Paragraph("Backend Developer | Java & Spring Boot");
        role.getStyle().set("color", "#cccccc")
                .set("font-family", codingFont)
                .set("margin-top", "0");

        // Contact info
        HorizontalLayout contacts = new HorizontalLayout();
        contacts.setSpacing(true);

        Button phone = new Button("(+855) 884-777-754", new Icon(VaadinIcon.PHONE));
        phone.getStyle().set("color", "white").set("background-color", "transparent").set("border", "none");

        Button email = new Button("sivlayyi.bs@gmail.com", new Icon(VaadinIcon.ENVELOPE));
        email.getStyle().set("color", "white").set("background-color", "transparent").set("border", "none");

        Button linkedin = new Button("LinkedIn", new Icon(VaadinIcon.BOOK));
        linkedin.getStyle().set("color", "white").set("background-color", "transparent").set("border", "none");
        linkedin.addClickListener(e -> linkedin.getUI().ifPresent(ui -> ui.getPage()
                .open("https://www.linkedin.com/in/sivlayyi/")));

        contacts.add(phone, email, linkedin);

        add(name, role, new AboutSection(), new EducationSection(), new SkillSection(), new ProjectsSection(), contacts);
    }
}
