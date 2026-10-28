# Portfolio

A Java 21 + Spring Boot 3.5.6 + Vaadin Flow 24.9.2 portfolio with a responsive dark theme.

## Local development

```bash
./gradlew bootRun
```

For Windows PowerShell:

```powershell
.\gradlew.bat bootRun
```

Open <http://localhost:8080>.

## Build and validate

```bash
./gradlew clean test bootJar
```

## Customize

- `src/main/java/com/base/portfolio/PortfolioContent.java` — personal copy, experience, skills, and projects.
- `src/main/java/com/base/views/HomeView.java` — Vaadin Flow view composition and legacy route aliases.
- `src/main/frontend/themes/my-theme/styles.css` — colors, layout, responsive breakpoints, and reduced-motion support.
- `src/main/resources/static/images/avatar.png` — your existing portrait (not replaced by this package).

The page is at `/`. Old URLs (`/about`, `/experience`, `/skill`, `/project`, `/contact`)
continue to work and scroll to their new single-page sections.

## Deployment

The Spring Boot application binds to `${PORT:8080}`, so Render can supply the platform port.
Use Java 21 on the hosting environment.

Example production build:

```bash
./gradlew clean bootJar -Pvaadin.productionMode
java -jar build/libs/portfolio-0.0.1-SNAPSHOT.jar
```

Review public-facing work history, project descriptions, and contact details before deploying.
