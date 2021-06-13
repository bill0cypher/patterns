package com.javabill0cypher.patterns.composite;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AdminRulePathGuard extends BaseGuard {

    public AdminRulePathGuard(Set<String> routes) {
        this.role = Role.ADMIN;
        this.routes = routes.stream().map(s -> Map.entry(s, Role.ADMIN)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public Role getSecurityLevel() {
        return role;
    }
}

