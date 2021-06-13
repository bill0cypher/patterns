package com.javabill0cypher.patterns.abstractfactory.prods.impl;

import com.javabill0cypher.patterns.abstractfactory.prods.Compiler;

public class TSCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("TypeScript code compiled: 0 warnings; 0 errors");
    }
}
