package com.epam.patterns.factory.abstr.website;

import com.epam.patterns.factory.abstr.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer write code");
    }
}
