package com.base.views;


import com.base.components.HeaderSection;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author YISivlay
 */
@Route("contact")
public class ContactView extends VerticalLayout {

    public ContactView() {
        setSizeFull();
        setPadding(true);
        getStyle().set("background-color", "#000000");

        add(new HeaderSection());

        H2 title = new H2("Contact Me");
        title.getStyle().set("color", "white")
                .set("font-family", "'Fira Code', 'JetBrains Mono', monospace");

        Paragraph contactInfo = new Paragraph("Email: sivlay@example.com");
        contactInfo.getStyle().set("color", "#cccccc")
                .set("font-family", "'Fira Code', monospace");

        Button emailButton = new Button("Send Email", e -> getUI().ifPresent(ui ->
                ui.getPage().executeJs("window.location.href='mailto:sivlay@example.com'")));

        add(title, contactInfo, emailButton);
    }
}
