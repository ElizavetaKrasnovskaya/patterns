package com.epam.patterns.factory.abstr.banking;

import com.epam.patterns.factory.abstr.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
