package com.base.portfolio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PortfolioContentTest {
    @Test
    void projectUrlsAreUniqueAndUseHttps() {
        assertEquals(PortfolioContent.PROJECTS.size(), PortfolioContent.PROJECTS.stream()
            .map(PortfolioContent.Project::url).distinct().count());
        assertTrue(PortfolioContent.PROJECTS.stream()
            .allMatch(project -> project.url().startsWith("https://github.com/")));
    }
}
