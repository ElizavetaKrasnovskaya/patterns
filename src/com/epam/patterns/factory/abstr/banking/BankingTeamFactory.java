package com.epam.patterns.factory.abstr.banking;

import com.epam.patterns.factory.abstr.Developer;
import com.epam.patterns.factory.abstr.ProjectManager;
import com.epam.patterns.factory.abstr.ProjectTeamFactory;
import com.epam.patterns.factory.abstr.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

}
