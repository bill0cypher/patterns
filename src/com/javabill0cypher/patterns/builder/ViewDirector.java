package com.javabill0cypher.patterns.builder;

public class ViewDirector {

    public void createPDFViewer(Viewer viewer) {
        viewer.setName("PDF Reader");
        viewer.setFormat("PDF");
        viewer.setReadingMode(ReadMode.COLD);
    }

    public void createEPUBViewer(Viewer viewer) {
        viewer.setName("EPUB Reader");
        viewer.setFormat("EPUB");
        viewer.setReadingMode(ReadMode.WARM);
    }
}
