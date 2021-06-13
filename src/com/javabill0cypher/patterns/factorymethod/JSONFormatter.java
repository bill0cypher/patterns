package com.javabill0cypher.patterns.factorymethod;

public class JSONFormatter implements Formatter{
    @Override
    public void parse() {
        System.out.println("Parsed from POJO to JSON");
    }

    @Override
    public void transform() {
        System.out.println("Transformed from JSON to POJO");
    }
}
