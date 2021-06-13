package com.javabill0cypher.patterns.memento.model;

public interface Operation {
    Operation getState();
    Double getSum();
}
