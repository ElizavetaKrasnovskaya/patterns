package com.epam.patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        System.out.println(developer.makeJob());

        Developer seniorDeveloper = new SeniorJavaDeveloper(developer);

        System.out.println(seniorDeveloper.makeJob());
    }
}
