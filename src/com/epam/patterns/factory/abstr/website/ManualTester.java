package com.epam.patterns.factory.abstr.website;

import com.epam.patterns.factory.abstr.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
