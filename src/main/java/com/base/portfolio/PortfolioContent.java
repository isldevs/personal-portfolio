package com.base.portfolio;

import java.util.List;

/** Public-facing portfolio content, independent of the Vaadin view layer. */
public final class PortfolioContent {
    public static final String NAME = "Sivlay Yi";
    public static final String ROLE = "Senior Java Backend Developer";
    public static final String EMAIL = "sivlayyi.bs@gmail.com";
    public static final String GITHUB = "https://github.com/isldevs";
    public static final String LINKEDIN = "https://www.linkedin.com/in/sivlayyi/";

    public static final List<Experience> EXPERIENCE = List.of(
        new Experience("Jul 2018 – Present", "Backend Developer", "Cam Info Services",
            "Developing Spring Boot services, REST APIs, and database-backed business applications. "
                + "Working with Java, Spring Data JPA, Hibernate, PostgreSQL, and MySQL."),
        new Experience("Mar 2018 – May 2018", "Java Programmer Intern", "Cam Info Services",
            "Supported Java backend development, SQL queries, and database operations.")
    );

    public static final List<SkillGroup> SKILLS = List.of(
        new SkillGroup("Backend engineering", List.of(
            "Java", "Spring Boot", "Spring Security", "Spring Data JPA", "Hibernate", "REST APIs")),
        new SkillGroup("Architecture & security", List.of(
            "Microservices", "OAuth2 / OIDC", "JWT", "API design", "Clean architecture", "JUnit / Mockito")),
        new SkillGroup("Data & delivery", List.of(
            "PostgreSQL", "MySQL", "Oracle", "Redis", "Docker", "Git", "Flyway", "CI/CD"))
    );

    public static final List<Project> PROJECTS = List.of(
        new Project("Featured / Architecture lab", "Banking Platform",
            "An active engineering project exploring secure APIs, independent services, "
                + "financial ledgers, reliable transfers, and event-driven workflows. "
                + "A development project, not a production banking system.",
            "Java · Spring Boot · PostgreSQL · Kafka · Redis",
            "https://github.com/isldevs/banking-platform"),
        new Project("Backend application", "iSLDevs",
            "Java and Spring Boot backend work covering authentication, persistence, "
                + "and containerized application development.",
            "Java · Spring Boot · PostgreSQL · OAuth2 · Docker",
            "https://github.com/isldevs/isldevs"),
        new Project("Device integration", "Attendance Sync",
            "Synchronizes attendance records from fingerprint devices to client systems.",
            "Java · Spring Boot · MySQL",
            "https://github.com/isldevs/attendance-sync"),
        new Project("Automation", "Telegram Invoice Bot",
            "A Telegram API integration for automated invoice notifications.",
            "Java · Spring Boot · Telegram API",
            "https://github.com/isldevs/telegrambot")
    );

    private PortfolioContent() {}

    public record Experience(String period, String title, String company, String summary) {}
    public record SkillGroup(String title, List<String> technologies) {}
    public record Project(String category, String name, String description, String stack, String url) {}
}
