package com.javabill0cypher.patterns.composite;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UserRulePathGuard extends BaseGuard {

    public UserRulePathGuard(Set<String> routes) {
        this.role = Role.USER;
        this.routes = routes.stream().map(s -> Map.entry(s, Role.USER)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public Role getSecurityLevel() {
        return role;
    }
}
