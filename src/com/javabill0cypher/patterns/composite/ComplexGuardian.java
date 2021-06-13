package com.javabill0cypher.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexGuardian extends BaseGuard{
    protected List<PathGuard> guards = new ArrayList<>();

    public ComplexGuardian(PathGuard ...guards) {
        addAll(guards);
    }

    public void add(PathGuard guard) {
        this.guards.add(guard);
    }

    public void addAll(PathGuard ...guards) {
        this.guards.addAll(Arrays.asList(guards));
    }

    @Override
    public boolean pathAvailable(Person person, String path) {
        return this.guards.stream()
                .filter(guard -> guard.getSecurityLevel().equals(person.getRole()))
                .anyMatch(guard -> guard.pathAvailable(person, path));
    }
}
