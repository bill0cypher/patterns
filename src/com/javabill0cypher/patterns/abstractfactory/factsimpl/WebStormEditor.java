package com.javabill0cypher.patterns.abstractfactory.factsimpl;

import com.javabill0cypher.patterns.abstractfactory.JetBrainsEditor;
import com.javabill0cypher.patterns.abstractfactory.prods.Analyzer;
import com.javabill0cypher.patterns.abstractfactory.prods.Compiler;
import com.javabill0cypher.patterns.abstractfactory.prods.impl.TSCompiler;
import com.javabill0cypher.patterns.abstractfactory.prods.impl.TSLint;

public class WebStormEditor extends JetBrainsEditor {

    @Override
    public Analyzer createAnalyzer() {
        return new TSLint();
    }

    @Override
    public Compiler createCompiler() {
        return new TSCompiler();
    }
}
