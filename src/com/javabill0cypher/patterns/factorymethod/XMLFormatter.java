package com.javabill0cypher.patterns.factorymethod;

public class XMLFormatter implements Formatter{
    @Override
    public void parse() {
        System.out.println("Parsed from POJO to XML");
    }

    @Override
    public void transform() {
        System.out.println("Transformed from XML to POJO");
    }
}
