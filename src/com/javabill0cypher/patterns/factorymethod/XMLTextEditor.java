package com.javabill0cypher.patterns.factorymethod;

public class XMLTextEditor extends Creator{

    @Override
    public Formatter createFormatter() {
        return new XMLFormatter();
    }
}
