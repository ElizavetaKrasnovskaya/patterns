package com.epam.patterns.strategy;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping");
    }
}
