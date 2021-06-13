package com.javabill0cypher.patterns.builder;

public interface Viewer {
    void setName(String name);
    void setFormat(String format);
    void setSize(long size);
    void setPages(int count);
    void setReadingMode(ReadMode mode);
    Viewer getResult();
}
