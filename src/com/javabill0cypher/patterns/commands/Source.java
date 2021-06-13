package com.javabill0cypher.patterns.commands;

public interface Source {
    boolean writeData(String data);
    String readData();
}
