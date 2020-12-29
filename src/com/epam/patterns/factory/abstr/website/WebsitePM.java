package com.epam.patterns.factory.abstr.website;

import com.epam.patterns.factory.abstr.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
