package com.javabill0cypher.patterns.composite;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OwnerPathGuard extends BaseGuard {

    public OwnerPathGuard(Set<String> routes) {
        this.role = Role.OWNER;
        this.routes = routes.stream().map(s -> Map.entry(s, Role.OWNER)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public Role getSecurityLevel() {
        return role;
    }
}
