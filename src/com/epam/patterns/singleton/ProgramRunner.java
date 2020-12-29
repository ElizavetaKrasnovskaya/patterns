package com.epam.patterns.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}

