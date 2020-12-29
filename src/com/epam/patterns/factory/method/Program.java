package com.epam.patterns.factory.method;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactory(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + "is unknown");
        }
    }
}
