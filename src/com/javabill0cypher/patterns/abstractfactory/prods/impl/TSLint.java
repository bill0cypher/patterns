package com.javabill0cypher.patterns.abstractfactory.prods.impl;

import com.javabill0cypher.patterns.abstractfactory.prods.Analyzer;

public class TSLint implements Analyzer {
    @Override
    public void analyze() {
        System.out.println("TypeScript: 0 warnings; 0 errors");
    }
}
