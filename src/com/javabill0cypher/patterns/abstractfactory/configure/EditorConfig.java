package com.javabill0cypher.patterns.abstractfactory.configure;

import com.javabill0cypher.patterns.abstractfactory.JetBrainsEditor;
import com.javabill0cypher.patterns.abstractfactory.factsimpl.IntellijIDEAEditor;
import com.javabill0cypher.patterns.abstractfactory.factsimpl.WebStormEditor;

public class EditorConfig {
    public static JetBrainsEditor createEditor(String editor) {
        return switch (editor) {
            case "IDEA" -> new IntellijIDEAEditor();
            case "STORM" -> new WebStormEditor();
            default -> throw new RuntimeException("There is no such editor");
        };
    }
}
