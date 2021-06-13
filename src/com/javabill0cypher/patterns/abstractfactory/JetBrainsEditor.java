package com.javabill0cypher.patterns.abstractfactory;

import com.javabill0cypher.patterns.abstractfactory.prods.Analyzer;
import com.javabill0cypher.patterns.abstractfactory.prods.Compiler;

public abstract class JetBrainsEditor {
    public abstract Analyzer createAnalyzer();
    public abstract Compiler createCompiler();
}
