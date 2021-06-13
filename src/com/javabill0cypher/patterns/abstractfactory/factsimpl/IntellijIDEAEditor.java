package com.javabill0cypher.patterns.abstractfactory.factsimpl;

import com.javabill0cypher.patterns.abstractfactory.JetBrainsEditor;
import com.javabill0cypher.patterns.abstractfactory.prods.Analyzer;
import com.javabill0cypher.patterns.abstractfactory.prods.Compiler;
import com.javabill0cypher.patterns.abstractfactory.prods.impl.JavaCompiler;
import com.javabill0cypher.patterns.abstractfactory.prods.impl.SonarLint;

public class IntellijIDEAEditor extends JetBrainsEditor {
    @Override
    public Analyzer createAnalyzer() {
        return new SonarLint();
    }

    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }
}
