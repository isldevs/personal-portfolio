package com.base.views;

import com.base.portfolio.PortfolioContent;
import com.base.portfolio.PortfolioContent.Experience;
import com.base.portfolio.PortfolioContent.Project;
import com.base.portfolio.PortfolioContent.SkillGroup;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

/** Single-page Vaadin Flow portfolio with aliases for existing public URLs. */
@PageTitle("Sivlay Yi | Senior Java Backend Developer")
@Route("")
@RouteAlias("about")
@RouteAlias("experience")
@RouteAlias("skill")
@RouteAlias("project")
@RouteAlias("contact")
public final class HomeView extends Div implements AfterNavigationObserver {

    public HomeView() {
        addClassName("portfolio-page");
        Anchor skip = link("#main-content", "Skip to content", "skip-link");
        Div main = block("page-main", hero(), about(), experience(), skills(), projects(), education(), contact());
        main.setId("main-content");
        main.getElement().setAttribute("role", "main");
        add(skip, header(), main, footer());
    }

    private Div header() {
        Anchor brand = link("#home", "SY.", "brand");
        brand.getElement().setAttribute("aria-label", "Sivlay Yi – go to top");
        Div navigation = block("navigation-links",
            link("#about", "About", "nav-link"),
            link("#experience", "Experience", "nav-link"),
            link("#skills", "Expertise", "nav-link"),
            link("#projects", "Projects", "nav-link"));
        navigation.getElement().setAttribute("role", "navigation");
        navigation.getElement().setAttribute("aria-label", "Primary navigation");
        Div header = block("site-header", block("header-inner", brand, navigation,
            link("mailto:" + PortfolioContent.EMAIL, "Let's talk ↗", "header-cta")));
        header.getElement().setAttribute("role", "banner");
        return header;
    }

    private Div hero() {
        H1 headline = new H1("Building dependable software for complex business needs.");
        headline.addClassName("hero-title");
        Paragraph intro = new Paragraph("I'm Sivlay, a senior Java backend developer focused on "
            + "Spring Boot, enterprise APIs, data integrity, and secure distributed systems.");
        intro.addClassName("hero-intro");
        Div copy = block("hero-copy",
            text("JAVA · SPRING BOOT · ENTERPRISE SYSTEMS", "eyebrow hero-eyebrow"),
            headline, intro,
            block("hero-actions", link("#projects", "Explore my work ↗", "button-primary"),
                link("#about", "More about me", "button-secondary")),
            block("hero-highlights",
                highlight("Java & Spring Boot", "Core focus"),
                highlight("Banking & enterprise", "Domain expertise"),
                highlight("Since 2018", "Professional journey")));

        Image portrait = new Image("images/avatar.png", "Portrait of Sivlay Yi");
        portrait.addClassName("hero-portrait");
        Div visual = block("hero-visual",
            block("portrait-wrap", portrait),
            block("stack-preview", text("ENGINEERING FOCUS", "eyebrow"),
                text("Secure APIs", "stack-title"),
                text("Data integrity · Distributed services · Maintainability", "stack-description")));
        Div hero = block("hero content-container", copy, visual);
        hero.setId("home");
        return hero;
    }

    private Div about() {
        Div copy = block("about-copy",
            new Paragraph("My work centers on the foundations that make backend services trustworthy: "
                + "clear contracts, service boundaries, predictable persistence, and security "
                + "built into everyday engineering decisions."),
            new Paragraph("I enjoy translating complex business requirements into maintainable "
                + "Java and Spring Boot applications. My interests include banking workflows, "
                + "API architecture, and pragmatic engineering practices."));
        Div values = block("about-aside", text("WHAT I VALUE", "eyebrow"),
            value("01", "Correctness before complexity"),
            value("02", "Maintainable, well-tested code"),
            value("03", "Secure and observable services"));
        return section("about", "01 / ABOUT", "Engineering with purpose",
            "A little more about how I approach backend development.", block("about-grid", copy, values));
    }

    private Div experience() {
        Div list = block("experience-list");
        for (Experience role : PortfolioContent.EXPERIENCE) {
            H3 title = new H3(role.title());
            Paragraph summary = new Paragraph(role.summary());
            summary.addClassName("timeline-summary");
            list.add(block("timeline-item", text(role.period(), "timeline-date"),
                block("timeline-content", title, text(role.company(), "timeline-company"), summary)));
        }
        return section("experience", "02 / EXPERIENCE", "Professional journey",
            "Backend engineering, delivery, and continuous learning.", list);
    }

    private Div skills() {
        Div grid = block("skill-grid");
        for (SkillGroup group : PortfolioContent.SKILLS) {
            Div tags = block("tag-list");
            for (String skill : group.technologies()) {
                tags.add(text(skill, "skill-tag"));
            }
            grid.add(block("skill-card", new H3(group.title()), tags));
        }
        return section("skills", "03 / EXPERTISE", "Tools I work with",
            "A practical toolkit for building and operating Java backend services.", grid);
    }

    private Div projects() {
        Div grid = block("project-grid");
        for (Project project : PortfolioContent.PROJECTS) {
            Paragraph summary = new Paragraph(project.description());
            summary.addClassName("project-description");
            grid.add(block("project-card", text(project.category(), "eyebrow"),
                new H3(project.name()), summary, text(project.stack(), "project-stack"),
                externalLink(project.url(), "View repository ↗", "project-link")));
        }
        return section("projects", "04 / SELECTED WORK", "Projects and experiments",
            "Public repositories that show what I build and explore.", grid);
    }

    private Div education() {
        return section("education", "05 / EDUCATION", "Learning foundations",
            "Formal education that started my software engineering journey.",
            block("education-grid",
                educationCard("2018", "Bachelor of Computer Science", "Royal University of Phnom Penh"),
                educationCard("2014", "High School Diploma", "Pak Klang High School")));
    }

    private Div contact() {
        H2 title = new H2("Let's build something reliable.");
        Paragraph copy = new Paragraph("Interested in Java backend engineering, enterprise systems, "
            + "or collaborating on an interesting project? Get in touch.");
        copy.addClassName("contact-description");
        Div panel = block("contact-panel", text("06 / CONTACT", "eyebrow"), title, copy,
            block("hero-actions", link("mailto:" + PortfolioContent.EMAIL, "Email me ↗", "button-primary"),
                externalLink(PortfolioContent.LINKEDIN, "LinkedIn ↗", "button-secondary")));
        panel.setId("contact");
        return block("contact-section content-container", panel);
    }

    private Div footer() {
        Div footer = block("site-footer", block("footer-inner content-container",
            text("© " + java.time.Year.now().getValue() + " " + PortfolioContent.NAME, "footer-copyright"),
            block("footer-links", externalLink(PortfolioContent.GITHUB, "GitHub", "footer-link"),
                externalLink(PortfolioContent.LINKEDIN, "LinkedIn", "footer-link"),
                link("mailto:" + PortfolioContent.EMAIL, "Email", "footer-link"))));
        footer.getElement().setAttribute("role", "contentinfo");
        return footer;
    }

    private static Div section(String id, String number, String title, String lead, Component content) {
        H2 heading = new H2(title);
        heading.addClassName("section-title");
        Paragraph subtitle = new Paragraph(lead);
        subtitle.addClassName("section-description");
        Div view = block("section content-container",
            block("section-heading", text(number, "eyebrow"), heading, subtitle), content);
        view.setId(id);
        return view;
    }

    private static Div highlight(String title, String label) {
        return block("highlight", text(title, "highlight-value"), text(label, "highlight-caption"));
    }

    private static Div value(String number, String label) {
        return block("value-row", text(number, "value-number"), text(label, "value-label"));
    }

    private static Div educationCard(String year, String qualification, String school) {
        return block("education-card", text(year, "eyebrow"), new H3(qualification),
            text(school, "education-school"));
    }

    private static Span text(String value, String classNames) {
        Span span = new Span(value);
        span.addClassNames(classNames.split(" "));
        return span;
    }

    private static Anchor link(String href, String label, String classNames) {
        Anchor anchor = new Anchor(href, label);
        anchor.addClassNames(classNames.split(" "));
        return anchor;
    }

    private static Anchor externalLink(String href, String label, String className) {
        Anchor anchor = link(href, label, className);
        anchor.setTarget("_blank");
        anchor.getElement().setAttribute("rel", "noopener noreferrer");
        return anchor;
    }

    private static Div block(String classNames, Component... children) {
        Div div = new Div(children);
        div.addClassNames(classNames.split(" "));
        return div;
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {
        String id = switch (event.getLocation().getPath()) {
            case "about" -> "about";
            case "experience" -> "experience";
            case "skill" -> "skills";
            case "project" -> "projects";
            case "contact" -> "contact";
            default -> null;
        };
        if (id != null) {
            getUI().ifPresent(ui -> ui.getPage().executeJs(
                "requestAnimationFrame(() => document.getElementById($0)?.scrollIntoView({block: 'start'}))", id));
        }
    }
}
