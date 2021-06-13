package com.javabill0cypher.patterns.decorator;

public interface DataSource {
    String readData();
    void writeData(String data);
}
