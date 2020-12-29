package com.epam.patterns.factory.abstr.banking;

import com.epam.patterns.factory.abstr.Tester;

public class QATester implements Tester {

    @Override
    public void testCode() {
        System.out.println("QA tester test banking code");
    }
}
