package com.javabill0cypher.patterns.factorymethod;

public class JSONTextEditor extends Creator{

    @Override
    public Formatter createFormatter() {
        return new JSONFormatter();
    }
}
