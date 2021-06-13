package com.javabill0cypher.patterns.builder;

public class EPUBViewer implements Viewer{
    private String name;
    private String format;
    private long size;
    private int pagesCount;
    private ReadMode mode;

    public EPUBViewer() {
    }

    public EPUBViewer(String name, String format, long size, int pagesCount, ReadMode mode) {
        this.name = name;
        this.format = format;
        this.size = size;
        this.pagesCount = pagesCount;
        this.mode = mode;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public void setPages(int count) {
        this.pagesCount = count;
    }

    @Override
    public void setReadingMode(ReadMode mode) {
        this.mode = mode;
    }

    @Override
    public Viewer getResult() {
        return new EPUBViewer(name, format, size, pagesCount, mode);
    }

    @Override
    public String toString() {
        return "EPUBViewer{" +
                "name='" + name + '\'' +
                ", format='" + format + '\'' +
                ", size=" + size +
                ", pagesCount=" + pagesCount +
                ", mode=" + mode +
                '}';
    }
}
