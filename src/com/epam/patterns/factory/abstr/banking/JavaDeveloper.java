package com.epam.patterns.factory.abstr.banking;

import com.epam.patterns.factory.abstr.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer write code");
    }
}
