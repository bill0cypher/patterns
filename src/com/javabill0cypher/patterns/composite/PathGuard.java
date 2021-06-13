package com.javabill0cypher.patterns.composite;

import java.util.Set;

public interface PathGuard {
    boolean pathAvailable(Person person, String path);
    Set<String> getAvailableEndpoints(Person person);
    Role getSecurityLevel();
}
