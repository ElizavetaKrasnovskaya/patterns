package com.epam.patterns.factory.abstr.website;

import com.epam.patterns.factory.abstr.Developer;
import com.epam.patterns.factory.abstr.ProjectManager;
import com.epam.patterns.factory.abstr.ProjectTeamFactory;
import com.epam.patterns.factory.abstr.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }
}
