package com.epam.patterns.factory.abstr;

public interface ProjectTeamFactory {

    Tester getTester();
    ProjectManager getProjectManager();
    Developer getDeveloper();
}
