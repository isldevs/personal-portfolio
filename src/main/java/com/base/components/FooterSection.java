package com.base.components;


import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * @author YISivlay
 */
public class FooterSection extends VerticalLayout {
    public FooterSection() {
        setWidthFull();
        setPadding(true);
        setSpacing(false);
        setAlignItems(FlexComponent.Alignment.CENTER);
        getStyle()
                .set("background-color", "black")
                .set("padding", "20px 0")
                .set("border-top", "1px solid #333");

        // Social icons
        HorizontalLayout socialLinks = new HorizontalLayout();
        socialLinks.setSpacing(true);
        socialLinks.setAlignItems(FlexComponent.Alignment.CENTER);

        Anchor github = createIconLink("https://github.com/isldevs", "icons/github.svg","GitHub" );
        Anchor linkedin = createIconLink("https://linkedin.com/in/sivlayyi", "icons/linkedin.svg", "LinkedIn");

        socialLinks.add(github, linkedin);

        Paragraph credit = new Paragraph("© 2025 Sivlay Yi");
        credit.getStyle()
                .set("color", "#888")
                .set("font-size", "0.9em")
                .set("margin", "10px 0 0 0");

        add(socialLinks, credit);
    }

    private Anchor createIconLink(String url, String iconPath, String alt) {
        Image icon = new Image(iconPath, alt);
        icon.setWidth("24px");
        icon.setHeight("24px");
        icon.getStyle().set("filter", "invert(0.8)"); // makes icons white-ish on dark bg

        Anchor link = new Anchor(url, icon);
        link.setTarget("_blank");
        link.getStyle().set("text-decoration", "none");

        return link;
    }

}
