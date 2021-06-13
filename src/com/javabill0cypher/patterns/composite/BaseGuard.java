package com.javabill0cypher.patterns.composite;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class BaseGuard implements PathGuard {
    protected Map<String, Role> routes;
    protected Role role;

    @Override
    public boolean pathAvailable(Person person, String path) {
        return routes.containsKey(path) && routes.get(path).equals(person.getRole());
    }

    @Override
    public Set<String> getAvailableEndpoints(Person person) {
        return routes.entrySet().stream()
                .takeWhile(stringRoleEntry -> stringRoleEntry.getValue().equals(person.getRole()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    @Override
    public Role getSecurityLevel() {
        return role;
    }
}
