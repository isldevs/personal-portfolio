package com.base.components;


import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * @author YISivlay
 */
public class EducationSection extends VerticalLayout {

    public EducationSection() {
        setId("about"); // scroll target
        setPadding(true);
        setSpacing(true);
        setWidthFull();

        String codingFont = "'Fira Code', 'JetBrains Mono', monospace";

        HorizontalLayout titleLayout = new HorizontalLayout();
        titleLayout.setWidthFull();
        titleLayout.setJustifyContentMode(JustifyContentMode.CENTER);

        H2 title = new H2("Education");
        title.getStyle().set("color", "white").set("font-family", codingFont);

        titleLayout.add(title);

        VerticalLayout list = new VerticalLayout();
        list.setSpacing(false);
        list.setPadding(false);

        // Royal University
        Span ru = new Span("Royal University of Phnom Penh — Bachelor of Computer Science (2018)");
        ru.getStyle().set("color", "#cccccc").set("font-family", codingFont);

        // High School
        Span hs = new Span("Pak Klang High School — High School Diploma (2014)");
        hs.getStyle().set("color", "#cccccc").set("font-family", codingFont);

        list.add(ru, hs);
        add(titleLayout, list);
    }
}
